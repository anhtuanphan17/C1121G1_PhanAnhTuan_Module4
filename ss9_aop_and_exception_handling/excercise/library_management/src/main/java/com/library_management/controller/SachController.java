package com.library_management.controller;

import com.library_management.model.Sach;
import com.library_management.model.TheMuonSach;
import com.library_management.service.ISachService;
import com.library_management.service.ITheMuonSachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SachController {
    @Autowired
    ITheMuonSachService theMuonSachService;
    @Autowired
    ISachService sachService;


    @RequestMapping(value = {"", "/list"}, method = RequestMethod.GET)
    public String goTheMuonSachList(ModelMap modelMap, @PageableDefault(value = 2) Pageable pageable) {
        Page<Sach> sachList = sachService.findAllPaging(pageable);
        modelMap.addAttribute("sachList", sachList);

        return "sach/list";
    }

    @RequestMapping(value = "/muon/{id}", method = RequestMethod.GET)
    public String muonSachForm(ModelMap modelMap, @PathVariable int id) {
        Sach sach = sachService.findById(id);
        modelMap.addAttribute("sach", sach);
        return "sach/muon";
    }



    @PostMapping("/muon")
    public String MuonSach(@ModelAttribute Sach sach, RedirectAttributes redirectAttributes) {
        if (sach.getSoLuong() <= 0){
            redirectAttributes.addFlashAttribute("message", "Mượn không thành công vì đã hết sách!");
            return "redirect:/list";
        }

        TheMuonSach theMuonSach = new TheMuonSach();
        theMuonSach.setMaMuonSach((int) (Math.random() * 1000));
        theMuonSach.setTrangThai(true);
        theMuonSach.setSach(sach);
        theMuonSachService.save(theMuonSach);
        sach.setSoLuong(sach.getSoLuong() - 1);
        sachService.save(sach);
        redirectAttributes.addFlashAttribute("success", "Mượn thành công!");
        return "redirect:list";
    }

    @RequestMapping(value = "/tra/{id}", method = RequestMethod.GET)
    public String traSachForm(ModelMap modelMap, @PathVariable int id) {

        return "sach/tra";
    }

    @PostMapping("/tra")
    public String traSach(@RequestParam("maMuonSach") String maMuonSach, RedirectAttributes redirectAttributes) {
        Integer maMuonSachInteger = Integer.valueOf(maMuonSach);
        TheMuonSach theMuonSach = theMuonSachService.findById(maMuonSachInteger);

        if(maMuonSachInteger!=null) {
            theMuonSach.setTrangThai(false);

            Sach sach = new Sach();
            sach.setMaSach(theMuonSach.getSach().getMaSach());
            sach.setTenSach(theMuonSach.getSach().getTenSach());
            sach.setTacGia(theMuonSach.getSach().getTacGia());
            sach.setSoLuong(theMuonSach.getSach().getSoLuong() + 1);
            sach.setMoTa(theMuonSach.getSach().getMoTa());
            sachService.save(sach);
            theMuonSachService.save(theMuonSach);
            redirectAttributes.addFlashAttribute("message", "trả sách thành công!");
            return "redirect:list";
        }else{
            redirectAttributes.addFlashAttribute("message","Ma muon sach khong ton tai");
            return "redirect:list";
        }
    }
}


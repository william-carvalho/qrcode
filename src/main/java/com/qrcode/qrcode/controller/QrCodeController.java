package com.qrcode.qrcode.controller;


import com.qrcode.qrcode.service.QrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class QrCodeController {

    @Autowired
    QrCodeService qrCodeService;

    @RequestMapping(value = "/createQRCode")
    public void createCommonQRCode(HttpServletResponse response, String url) throws Exception {
        qrCodeService.createQRCode(response, url);
    }


    @RequestMapping(value = "/createQRCodeLogo")
    public void createLogoQRCode(HttpServletResponse response, String url) throws Exception {
        qrCodeService.createQRCodeLogo(response, url);
    }
}

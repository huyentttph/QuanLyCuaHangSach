/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlchs.utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author tachi
 */
public class XImage {

    public static Image getAppIcon() {
        URL url = XImage.class.getResource("/com/QLNS/icon/fpt.png");
        return new ImageIcon(url).getImage();
    }

    public static void save(File src) {
        File dst = new File("logos", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
            //StandardCopyOption.REPLACE_EXISTING :  Tiêu chuẩn thay thế cái đã tồn tại
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static ImageIcon read(String filname){
        File path = new File("logoss", filname);
        return new ImageIcon(new ImageIcon(path.getAbsolutePath()).getImage().getScaledInstance(158, 198,Image.SCALE_DEFAULT));
    }
}

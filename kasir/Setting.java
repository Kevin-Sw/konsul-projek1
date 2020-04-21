/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.kasir;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Setting {
    private String IkanSalmon;
    private String Oatmeal;
    private String Yogurt;
    private String SaladSayur;
    private String SaladBuah;
    private String Omelet;
    private String TehHijau;
    private String SupAyam;
    private String JusAlpukat;
    private String JusMangga;
    private String JusJeruk;
    
    private JFrame frame;
    
     public void iExitSystem(){
         frame = new JFrame("Exit"); 
         
         if (JOptionPane.showConfirmDialog(frame, "Apakah kamu yakin mau "
                 + "keluar dari aplikasi","Healty Food ADK",
                 JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
             System.exit(0);
         }
     }
     

    public String getIkanSalmon() {
        return IkanSalmon;
    }

    public void setIkanSalmon(String IkanSalmon) {
        this.IkanSalmon = IkanSalmon;
    }

    public String getOatmeal() {
        return Oatmeal;
    }

    public void setOatmeal(String Oatmeal) {
        this.Oatmeal = Oatmeal;
    }

    public String getYogurt() {
        return Yogurt;
    }

    public void setYogurt(String Yogurt) {
        this.Yogurt = Yogurt;
    }

    public String getSaladSayur() {
        return SaladSayur;
    }

    public void setSaladSayur(String SaladSayur) {
        this.SaladSayur = SaladSayur;
    }

    public String getSaladBuah() {
        return SaladBuah;
    }

    public void setSaladBuah(String SaladBuah) {
        this.SaladBuah = SaladBuah;
    }

    public String getOmelet() {
        return Omelet;
    }

    public void setOmelet(String Omelet) {
        this.Omelet = Omelet;
    }

    public String getTehHijau() {
        return TehHijau;
    }

    public void setTehHijau(String TehHijau) {
        this.TehHijau = TehHijau;
    }

    public String getSupAyam() {
        return SupAyam;
    }

    public void setSupAyam(String SupAyam) {
        this.SupAyam = SupAyam;
    }

    public String getJusAlpukat() {
        return JusAlpukat;
    }

    public void setJusAlpukat(String JusAlpukat) {
        this.JusAlpukat = JusAlpukat;
    }

    public String getJusMangga() {
        return JusMangga;
    }

    public void setJusMangga(String JusMangga) {
        this.JusMangga = JusMangga;
    }

    public String getJusJeruk() {
        return JusJeruk;
    }

    public void setJusJeruk(String JusJeruk) {
        this.JusJeruk = JusJeruk;
    }
    
    
   

}

 
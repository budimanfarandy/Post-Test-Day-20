package com.juaracoding.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class FinancialRecord {

    public AndroidDriver<MobileElement> driver;

    public FinancialRecord(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    /*   Pemasukan   */
    @AndroidFindBy(id = "com.chad.financialrecord:id/fabMenu")
    private MobileElement tambah;
    // Pilih Menu Pemasukan
    @AndroidFindBy(id = "com.chad.financialrecord:id/btnIncome")
    private MobileElement pemasukan;


    // Pilih Tanggal
    @AndroidFindBy(id = "com.chad.financialrecord:id/tvDate")
    private MobileElement tglMasuk;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"16 Oktober 2023\"]")
    private MobileElement pilihTanggalMasuk;

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement simpanTanggalMasuk ;


    // Pilih Kategori
    @AndroidFindBy(id = "com.chad.financialrecord:id/tvName")
    private MobileElement kategoriPemasukan;

    @AndroidFindBy(xpath = "//android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView")
    private MobileElement pilihKategoriMasuk;


    // Input Jumlah Pemasukan
    @AndroidFindBy(id = "com.chad.financialrecord:id/etAmount")
    private MobileElement jumlahMasuk;
    // Input Keterangan
    @AndroidFindBy(id = "com.chad.financialrecord:id/etNote")
    private MobileElement keterangan;
    // Simpan Catatan Pemasukan
    @AndroidFindBy(id = "com.chad.financialrecord:id/btSave")
    private MobileElement btSimpan;


    /*    Pengeluaran   */
    @AndroidFindBy(id = "com.chad.financialrecord:id/fabMenu")
    private MobileElement tambahDua;
    @AndroidFindBy(id = "com.chad.financialrecord:id/btnExpense")
    private MobileElement pengeluaran;

    // Pilih Tanggal
    @AndroidFindBy(id = "com.chad.financialrecord:id/tvDate")
    private MobileElement tglKeluar;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"17 Oktober 2023\"]")
    private MobileElement pilihTanggalKeluar;

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement simpanTanggalKeluar;

    // Pilih Kategori
    @AndroidFindBy(id = "com.chad.financialrecord:id/tvName")
    private MobileElement kategoriPengeluaran;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[12]/android.widget.LinearLayout/android.widget.TextView")
    private MobileElement pilihKategoriPengeluaran;

    //Input Jumlah Pengeluaran
    @AndroidFindBy(id = "com.chad.financialrecord:id/etAmount")
    private MobileElement jumlahKeluar;

    // Input Keterangan
    @AndroidFindBy(id = "com.chad.financialrecord:id/etNote")
    private MobileElement keteranganKeluar;

    // Simpan Catatan Pengeluaran
    @AndroidFindBy(id = "com.chad.financialrecord:id/btSave")
    private MobileElement btnSimpan;

    //Method
    public void findAdd() {
        tambah.click();
        pemasukan.click();
        tglMasuk.click();
        pilihTanggalMasuk.click();
        simpanTanggalMasuk.click();
        kategoriPemasukan.click();
        pilihKategoriMasuk.click();
        jumlahMasuk.sendKeys("100000");
        keterangan.sendKeys("Gaji Bulanan");
        btSimpan.click();
    }
    public void findOut() {
        tambahDua.click();
        pengeluaran.click();
        tglKeluar.click();
        pilihTanggalKeluar.click();
        simpanTanggalKeluar.click();
        kategoriPengeluaran.click();
        pilihKategoriPengeluaran.click();
        jumlahKeluar.sendKeys("50000");
        keteranganKeluar.sendKeys("Pengeluaran Tagihan Listrik");
        btnSimpan.click();
    }

    public String getTxtResult() {
        return keterangan.getText();
    }
    public String getTxtResultDua() {
        return keteranganKeluar.getText();
    }



}
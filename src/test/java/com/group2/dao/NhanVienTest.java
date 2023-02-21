/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group2.dao;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.group2.entity.NhanVien;


/**
 *
 * @author HieuHoang
 */
public class NhanVienTest {

    public NhanVienTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of insert method, of class NhanVienDAO.
     */
    @Test()
    public void testInsert() {
        System.out.println("Testcase1-insert nhan vien");
        NhanVien entity = null;
        NhanVienDAO instance = new NhanVienDAO();
        try {
            instance.insert(entity);
        } catch (Exception e) {
        }
        
    }

    @Test
    public void testInsert1() {
        System.out.println("Testcase2-insert nhan vien");
        NhanVien entity = new NhanVien("NV10", "123456", "Nguyễn Văn An", "Quản lý", "an.png", "Quận 12", new Date("13/02/1999"));
        NhanVienDAO instance = new NhanVienDAO();
        try {
            instance.insert(entity);
        } catch (Exception e) {
        }

    }

    @Test
    public void testInsert2() {
        System.out.println("Testcase3-insert nhan vien");
        NhanVien entity = new NhanVien("NV01", "123456", "Nguyễn Văn An", "Quản lý", "an.png", "Quận 12", new Date("13/02/1999"));
        NhanVienDAO instance = new NhanVienDAO();
        try {
             instance.insert(entity);
        } catch (Exception e) {
        }
       
    }

    /**
     * Test of update method, of class NhanVienDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("Testcase1 - update nhân viên");
        NhanVien entity = null;
        NhanVienDAO instance = new NhanVienDAO();
        try {
            instance.update(entity);
        } catch (Exception e) {
        }

    }

    @Test
    public void testUpdate2() {
        System.out.println("Testcase1 - update nhân viên");
        NhanVien entity = new NhanVien("NV01", "123456", "Hoàng Văn Hiếu", "Quản lý", "an.png", "Quận 12", new Date("13/02/1999"));
        NhanVienDAO instance = new NhanVienDAO();
        try {
            instance.update(entity);
        } catch (Exception e) {
        }

    }

    @Test
    public void testUpdate3() {
        System.out.println("Testcase1 - update nhân viên");
        NhanVien entity = new NhanVien("NV11", "123456", "Hoàng Văn Hiếu", "Quản lý", "an.png", "Quận 12", new Date("13/02/1999"));
        NhanVienDAO instance = new NhanVienDAO();
        try {
            instance.update(entity);
        } catch (Exception e) {
        }

    }

    /**
     * Test of delete method, of class NhanVienDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("Testcase 1 - delete");
        String id = "";
        NhanVienDAO instance = new NhanVienDAO();
        instance.delete(id);
    }

    @Test
    public void testDelete1() {
        System.out.println("Testcase 1 - delete");
        String id = "NV11";
        NhanVienDAO instance = new NhanVienDAO();
        instance.delete(id);
    }

    @Test
    public void testDelete2() {
        System.out.println("Testcase 1 - delete");
        String id = "nv20";
        NhanVienDAO instance = new NhanVienDAO();
        instance.delete(id);
    }

    /**
     * Test of selectAll method, of class NhanVienDAO.
     */
   

    /**
     * Test of selectById method, of class NhanVienDAO.
     */
    @Test
    public void testSelectById() {
        System.out.println("Testcase 1 -selectById");
        String id = "NV01";
        NhanVienDAO instance = new NhanVienDAO();
        NhanVien result = instance.selectById(id);
        assertNotNull(result);

    }
    @Test
    public void testSelectById1() {
        System.out.println("Testcase 2 - selectById");
        String id = "NV11";
        NhanVienDAO instance = new NhanVienDAO();
        NhanVien result = instance.selectById(id);
        assertNull(result);

    }

    /**
     * Test of selectBySql method, of class NhanVienDAO.
     */
    /**
     * Test of timNhanVien method, of class NhanVienDAO.
     */
    @Test
    public void testTimNhanVienTheoHoTen() {
        System.out.println("Testcase1 - timNhanVien");
        String[] args = new String[]{"NV0"};
        NhanVienDAO instance = new NhanVienDAO();
        int length = 6;
        List<NhanVien> result = instance.timNhanVien(args);
        assertEquals(length, result.size());
    }

    @Test
    public void testTimNhanVienTheoHoTen1() {
        System.out.println("Testcase2 - timNhanVien");
        String[] args = new String[]{"aaa"};
        NhanVienDAO instance = new NhanVienDAO();
        int length = 0;
        List<NhanVien> result = instance.timNhanVien(args);
        assertEquals(length, result.size());
    }
}

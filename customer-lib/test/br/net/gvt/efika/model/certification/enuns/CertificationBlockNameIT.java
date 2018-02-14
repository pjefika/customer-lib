/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.model.certification.enuns;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import util.JacksonMapper;

/**
 *
 * @author G0042204
 */
public class CertificationBlockNameIT {

    public CertificationBlockNameIT() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class CertificationBlockName.
     */
    @Test
    public void testValues() throws Exception {
        System.out.println("values");
        JacksonMapper<CertificationBlockName> map = new JacksonMapper<>(CertificationBlockName.class);
        for (CertificationBlockName value : CertificationBlockName.values()) {
            System.out.println(map.serialize(value));
        }

    }

}

package Model;

import ShoppingService.Controller.ProductController;
import ShoppingService.Model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestProduct {

    private Product physicalProduct;
    private Product digitalProduct;

    @BeforeEach
    public void setUp() {
        physicalProduct = new PhysicalProduct("Physical Product", "This is a physical product", 10, 100.0, 5.0, true, "FreeTaxRate");
        digitalProduct = new DigitalProduct("Digital Product", "This is a digital product", 5, 50.0, false, "FreeTaxRate");
    }

    @Test
    public void testGetProductName() {
        assertEquals("Physical Product", physicalProduct.getName());
        assertEquals("Digital Product", digitalProduct.getName());
    }

    @Test
    public void testGetProductDescription() {
        assertEquals("This is a physical product", physicalProduct.getDescription());
        assertEquals("This is a digital product", digitalProduct.getDescription());
    }

    @Test
    public void testGetQuantityAvailable() {
        assertEquals(10, physicalProduct.getQuantityAvailable());
        assertEquals(5, digitalProduct.getQuantityAvailable());
    }

    @Test
    public void testGetPrice() {
        assertEquals(100.0, physicalProduct.getPrice());
        assertEquals(50.0, digitalProduct.getPrice());
    }

    @Test
    public void testIsGiftable() {
        assertTrue(physicalProduct.isGiftable());
        assertFalse(digitalProduct.isGiftable());
    }

    @Test
    public void testGetTaxType() {
        assertEquals("FreeTaxRate", physicalProduct.getTaxType());
        assertEquals("FreeTaxRate", digitalProduct.getTaxType());
    }

    @Test
    public void testGetType() {
        assertEquals("PHYSICAL", physicalProduct.getType());
        assertEquals("DIGITAL", digitalProduct.getType());
    }



}
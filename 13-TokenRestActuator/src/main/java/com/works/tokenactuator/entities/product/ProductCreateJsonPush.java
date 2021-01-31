
package com.works.tokenactuator.entities.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCreateJsonPush {

    private Object sku;
    private Object statu;
    private Object stock;
    private Object stockReel;
    private Object criticalStock;
    private Object negativestock;
    private Object quantityType;
    private Object tax;
    private Integer salePrice;
    private Integer costPrice;
    private String currency;
    private String costCurrency;
    private Object prepareDay;
    private Object desi;
    private Object isadult;
    private Object maxInstallment;
    private Object isfreecargo;
    private Object supplier;
    private Object suppliercode;
    private Object brandid;
    private Object eancode;
    private String category;
    private List<String> categories = null;
    private Locale locale;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getSku() {
        return sku;
    }

    public void setSku(Object sku) {
        this.sku = sku;
    }

    public Object getStatu() {
        return statu;
    }

    public void setStatu(Object statu) {
        this.statu = statu;
    }

    public Object getStock() {
        return stock;
    }

    public void setStock(Object stock) {
        this.stock = stock;
    }

    public Object getStockReel() {
        return stockReel;
    }

    public void setStockReel(Object stockReel) {
        this.stockReel = stockReel;
    }

    public Object getCriticalStock() {
        return criticalStock;
    }

    public void setCriticalStock(Object criticalStock) {
        this.criticalStock = criticalStock;
    }

    public Object getNegativestock() {
        return negativestock;
    }

    public void setNegativestock(Object negativestock) {
        this.negativestock = negativestock;
    }

    public Object getQuantityType() {
        return quantityType;
    }

    public void setQuantityType(Object quantityType) {
        this.quantityType = quantityType;
    }

    public Object getTax() {
        return tax;
    }

    public void setTax(Object tax) {
        this.tax = tax;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCostCurrency() {
        return costCurrency;
    }

    public void setCostCurrency(String costCurrency) {
        this.costCurrency = costCurrency;
    }

    public Object getPrepareDay() {
        return prepareDay;
    }

    public void setPrepareDay(Object prepareDay) {
        this.prepareDay = prepareDay;
    }

    public Object getDesi() {
        return desi;
    }

    public void setDesi(Object desi) {
        this.desi = desi;
    }

    public Object getIsadult() {
        return isadult;
    }

    public void setIsadult(Object isadult) {
        this.isadult = isadult;
    }

    public Object getMaxInstallment() {
        return maxInstallment;
    }

    public void setMaxInstallment(Object maxInstallment) {
        this.maxInstallment = maxInstallment;
    }

    public Object getIsfreecargo() {
        return isfreecargo;
    }

    public void setIsfreecargo(Object isfreecargo) {
        this.isfreecargo = isfreecargo;
    }

    public Object getSupplier() {
        return supplier;
    }

    public void setSupplier(Object supplier) {
        this.supplier = supplier;
    }

    public Object getSuppliercode() {
        return suppliercode;
    }

    public void setSuppliercode(Object suppliercode) {
        this.suppliercode = suppliercode;
    }

    public Object getBrandid() {
        return brandid;
    }

    public void setBrandid(Object brandid) {
        this.brandid = brandid;
    }

    public Object getEancode() {
        return eancode;
    }

    public void setEancode(Object eancode) {
        this.eancode = eancode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

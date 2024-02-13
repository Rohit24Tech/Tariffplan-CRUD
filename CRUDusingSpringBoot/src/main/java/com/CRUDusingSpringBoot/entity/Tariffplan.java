package com.CRUDusingSpringBoot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Tariffplan {
	
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "planType")
    private String planType;
	@Column(name = "planCategoery")
    private String planCategoery;
	@Column(name = "planCode")
    private String planCode;
	@Column(name = "packageName")
    private String packageName;
	@Column(name = "netopCode")
    private String netopCode;
	@Column(name = "description")
    private String description;
	@Column(name = "tenure")
    private Integer tenure;
	@Column(name = "OriginalPriceWithoutTax")
    private Integer OriginalPriceWithoutTax;
	@Column(name = "OfferOriginalPrice")
    private Integer OfferOriginalPrice;
    @Column(name = "priceWithTax")
    private Integer priceWithTax;
    @Column(name = "offerPriceWithTax")
    private Integer offerPriceWithTax;
    @Column(name = "installCharges")
    private Integer installCharges;
    @Column(name = "installChargesWithTax")
    private Integer installChargesWithTax;
    @Column(name = "planQuota")
    private Integer planQuota;
    @Column(name = "usageCategory")
    private String usageCategory;
    @Column(name = "currentSpeed")
    private Integer currentSpeed;
    @Column(name = "currentSpeedUnit")
    private String currentSpeedUnit;
    @Column(name = "speedBreakerSpeed")
    private Float speedBreakerSpeed;
    @Column(name = "isRouterFree")
    private String isRouterFree;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "cityName")
    private String cityName;
    @Column(name = "cityCode")
    private String cityCode;
    @Column(name = "cityId")
    private Double cityId;
    @Column(name = "staticIpPriceWithTax")
    private Integer staticIpPriceWithTax;
    @Column(name = "staticIpPriceWithoutTax")
    private Integer staticIpPriceWithoutTax;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public String getPlanCategoery() {
		return planCategoery;
	}
	public void setPlanCategoery(String planCategoery) {
		this.planCategoery = planCategoery;
	}
	public String getPlanCode() {
		return planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getNetopCode() {
		return netopCode;
	}
	public void setNetopCode(String netopCode) {
		this.netopCode = netopCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	public Integer getOriginalPriceWithoutTax() {
		return OriginalPriceWithoutTax;
	}
	public void setOriginalPriceWithoutTax(Integer originalPriceWithoutTax) {
		OriginalPriceWithoutTax = originalPriceWithoutTax;
	}
	public Integer getOfferOriginalPrice() {
		return OfferOriginalPrice;
	}
	public void setOfferOriginalPrice(Integer offerOriginalPrice) {
		OfferOriginalPrice = offerOriginalPrice;
	}
	public Integer getPriceWithTax() {
		return priceWithTax;
	}
	public void setPriceWithTax(Integer priceWithTax) {
		this.priceWithTax = priceWithTax;
	}
	public Integer getOfferPriceWithTax() {
		return offerPriceWithTax;
	}
	public void setOfferPriceWithTax(Integer offerPriceWithTax) {
		this.offerPriceWithTax = offerPriceWithTax;
	}
	public Integer getInstallCharges() {
		return installCharges;
	}
	public void setInstallCharges(Integer installCharges) {
		this.installCharges = installCharges;
	}
	public Integer getInstallChargesWithTax() {
		return installChargesWithTax;
	}
	public void setInstallChargesWithTax(Integer installChargesWithTax) {
		this.installChargesWithTax = installChargesWithTax;
	}
	public Integer getPlanQuota() {
		return planQuota;
	}
	public void setPlanQuota(Integer planQuota) {
		this.planQuota = planQuota;
	}
	public String getUsageCategory() {
		return usageCategory;
	}
	public void setUsageCategory(String usageCategory) {
		this.usageCategory = usageCategory;
	}
	public Integer getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(Integer currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public String getCurrentSpeedUnit() {
		return currentSpeedUnit;
	}
	public void setCurrentSpeedUnit(String currentSpeedUnit) {
		this.currentSpeedUnit = currentSpeedUnit;
	}
	public Float getSpeedBreakerSpeed() {
		return speedBreakerSpeed;
	}
	public void setSpeedBreakerSpeed(Float speedBreakerSpeed) {
		this.speedBreakerSpeed = speedBreakerSpeed;
	}
	public String getIsRouterFree() {
		return isRouterFree;
	}
	public void setIsRouterFree(String isRouterFree) {
		this.isRouterFree = isRouterFree;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public Double getCityId() {
		return cityId;
	}
	public void setCityId(Double cityId) {
		this.cityId = cityId;
	}
	public Integer getStaticIpPriceWithTax() {
		return staticIpPriceWithTax;
	}
	public void setStaticIpPriceWithTax(Integer staticIpPriceWithTax) {
		this.staticIpPriceWithTax = staticIpPriceWithTax;
	}
	public Integer getStaticIpPriceWithoutTax() {
		return staticIpPriceWithoutTax;
	}
	public void setStaticIpPriceWithoutTax(Integer staticIpPriceWithoutTax) {
		this.staticIpPriceWithoutTax = staticIpPriceWithoutTax;
	}
    
    
    
    

}

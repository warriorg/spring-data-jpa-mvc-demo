package com.myb.modul.activity.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.myb.infrastructure.domain.IdEntity;

/**
 * The persistent class for the t_info_Activity database table.
 * 
 */
@Entity
@Cacheable
@Table(name = "t_info_Activity")
public class T_info_Activity extends IdEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ActivityAddress")
	private String activityAddress;

	@Column(name = "ActivityCreateFlag")
	private short activityCreateFlag;

	@Column(name = "ActivityDetails")
	private String activityDetails;

	@Column(name = "ActivityEndDate")
	private Timestamp activityEndDate;

	@Column(name = "ActivityImageAddress")
	private long activityImageAddress;

	@Column(name = "ActivityLAT")
	private BigDecimal activityLAT;

	@Column(name = "ActivityLNG")
	private BigDecimal activityLNG;

	@Column(name = "ActivitySort")
	private long activitySort;

	@Column(name = "ActivityStartDate")
	private Timestamp activityStartDate;

	@Column(name = "ActivityTitle")
	private String activityTitle;

	@Column(name = "ActivityType")
	private long activityType;

	@Column(name = "Checker")
	private Long checker;

	@Column(name = "CheckStatus")
	private short checkStatus;

	@Column(name = "CheckTime")
	private Timestamp checkTime;

	@Column(name = "CityId")
	private long cityId;

	@Column(name = "CreateMCID")
	private Long createMCID;

	@Column(name = "CreateTime")
	private Timestamp createTime;

	@Column(name = "CreateUserID")
	private Long createUserID;

	@Column(name = "Flag")
	private short flag;

	@Column(name = "IsDefaultSort")
	private Short isDefaultSort;

	@Column(name = "IsEnd")
	private short isEnd;

	@Column(name = "IsPost")
	private Short isPost;

	@Column(name = "ModifyMCID")
	private Long modifyMCID;

	@Column(name = "ModifyTime")
	private Timestamp modifyTime;

	@Column(name = "ModifyUserID")
	private Long modifyUserID;

	@Column(name = "PlaceId")
	private long placeId;

	@Column(name = "PostFee")
	private BigDecimal postFee;

	@Column(name = "ProvinceId")
	private long provinceId;

	@Column(name = "RoundID")
	private Long roundID;

	@Column(name = "SetScore")
	private BigDecimal setScore;

	@Column(name = "SignEndDate")
	private Timestamp signEndDate;

	@Column(name = "SignPeople")
	private int signPeople;

	@Column(name = "SignStartDate")
	private Timestamp signStartDate;

	@Column(name = "SignTotals")
	private Long signTotals;

	@Column(name = "Sort")
	private BigDecimal sort;

	@Column(name = "UserStepID")
	private Long userStepID;

	@Column(name = "ViewTimes")
	private Integer viewTimes;

	@Column(name = "MaxSign")
	private Integer maxSign;

	@Column(name = "LimitMobile")
	private Short limitMobile;

	@Column(name = "ActivityDetailsHTML")
	private String activityDetailsHTML;

	@Column(name = "ControlLove")
	private Short controlLove;

	@Column(name = "IsPicToSign")
	private short isPicToSign;

	@Column(name = "InUseUnitCount")
	private int inUseUnitCount;

	@Column(name = "InUseAddressCount")
	private int inUseAddressCount;

	@Column(name = "InJoinUnitCount")
	private int inJoinUnitCount;

	@Column(name = "TypeTag")
	private Short typeTag;

	@Column(name = "AgeFrom")
	private Short ageFrom;

	@Column(name = "AgeEnd")
	private Short ageEnd;

	@Column(name = "SMSContent")
	private String smsContent;

	@Column(name = "SMSCheckContent")
	private String smsCheckContent;

	@Column(name = "Is5YuanUser")
	private Short is5YuanUser;

	@Column(name = "IsDelete")
	private short isDelete;

	public T_info_Activity() {
	}

	public String getActivityAddress() {
		return this.activityAddress;
	}

	public void setActivityAddress(String activityAddress) {
		this.activityAddress = activityAddress;
	}

	public short getActivityCreateFlag() {
		return this.activityCreateFlag;
	}

	public void setActivityCreateFlag(short activityCreateFlag) {
		this.activityCreateFlag = activityCreateFlag;
	}

	public String getActivityDetails() {
		return this.activityDetails;
	}

	public void setActivityDetails(String activityDetails) {
		this.activityDetails = activityDetails;
	}

	public Timestamp getActivityEndDate() {
		return this.activityEndDate;
	}

	public void setActivityEndDate(Timestamp activityEndDate) {
		this.activityEndDate = activityEndDate;
	}

	public long getActivityImageAddress() {
		return this.activityImageAddress;
	}

	public void setActivityImageAddress(long activityImageAddress) {
		this.activityImageAddress = activityImageAddress;
	}

	public BigDecimal getActivityLAT() {
		return this.activityLAT;
	}

	public void setActivityLAT(BigDecimal activityLAT) {
		this.activityLAT = activityLAT;
	}

	public BigDecimal getActivityLNG() {
		return this.activityLNG;
	}

	public void setActivityLNG(BigDecimal activityLNG) {
		this.activityLNG = activityLNG;
	}

	public long getActivitySort() {
		return this.activitySort;
	}

	public void setActivitySort(long activitySort) {
		this.activitySort = activitySort;
	}

	public Timestamp getActivityStartDate() {
		return this.activityStartDate;
	}

	public void setActivityStartDate(Timestamp activityStartDate) {
		this.activityStartDate = activityStartDate;
	}

	public String getActivityTitle() {
		return this.activityTitle;
	}

	public void setActivityTitle(String activityTitle) {
		this.activityTitle = activityTitle;
	}

	public long getActivityType() {
		return this.activityType;
	}

	public void setActivityType(long activityType) {
		this.activityType = activityType;
	}

	public Long getChecker() {
		return this.checker;
	}

	public void setChecker(Long checker) {
		this.checker = checker;
	}

	public short getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(short checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public long getCityId() {
		return this.cityId;
	}

	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	public Long getCreateMCID() {
		return this.createMCID;
	}

	public void setCreateMCID(Long createMCID) {
		this.createMCID = createMCID;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Long getCreateUserID() {
		return this.createUserID;
	}

	public void setCreateUserID(Long createUserID) {
		this.createUserID = createUserID;
	}

	public short getFlag() {
		return this.flag;
	}

	public void setFlag(short flag) {
		this.flag = flag;
	}

	public Short getIsDefaultSort() {
		return this.isDefaultSort;
	}

	public void setIsDefaultSort(Short isDefaultSort) {
		this.isDefaultSort = isDefaultSort;
	}

	public short getIsEnd() {
		return this.isEnd;
	}

	public void setIsEnd(short isEnd) {
		this.isEnd = isEnd;
	}

	public Short getIsPost() {
		return this.isPost;
	}

	public void setIsPost(Short isPost) {
		this.isPost = isPost;
	}

	public Long getModifyMCID() {
		return this.modifyMCID;
	}

	public void setModifyMCID(Long modifyMCID) {
		this.modifyMCID = modifyMCID;
	}

	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Long getModifyUserID() {
		return this.modifyUserID;
	}

	public void setModifyUserID(Long modifyUserID) {
		this.modifyUserID = modifyUserID;
	}

	public long getPlaceId() {
		return this.placeId;
	}

	public void setPlaceId(long placeId) {
		this.placeId = placeId;
	}

	public BigDecimal getPostFee() {
		return this.postFee;
	}

	public void setPostFee(BigDecimal postFee) {
		this.postFee = postFee;
	}

	public long getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(long provinceId) {
		this.provinceId = provinceId;
	}

	public Long getRoundID() {
		return this.roundID;
	}

	public void setRoundID(Long roundID) {
		this.roundID = roundID;
	}

	public BigDecimal getSetScore() {
		return this.setScore;
	}

	public void setSetScore(BigDecimal setScore) {
		this.setScore = setScore;
	}

	public Timestamp getSignEndDate() {
		return this.signEndDate;
	}

	public void setSignEndDate(Timestamp signEndDate) {
		this.signEndDate = signEndDate;
	}

	public int getSignPeople() {
		return this.signPeople;
	}

	public void setSignPeople(int signPeople) {
		this.signPeople = signPeople;
	}

	public Timestamp getSignStartDate() {
		return this.signStartDate;
	}

	public void setSignStartDate(Timestamp signStartDate) {
		this.signStartDate = signStartDate;
	}

	public Long getSignTotals() {
		return this.signTotals;
	}

	public void setSignTotals(Long signTotals) {
		this.signTotals = signTotals;
	}

	public BigDecimal getSort() {
		return this.sort;
	}

	public void setSort(BigDecimal sort) {
		this.sort = sort;
	}

	public Long getUserStepID() {
		return this.userStepID;
	}

	public void setUserStepID(Long userStepID) {
		this.userStepID = userStepID;
	}

	public Integer getViewTimes() {
		return this.viewTimes;
	}

	public void setViewTimes(Integer viewTimes) {
		this.viewTimes = viewTimes;
	}

	public Integer getMaxSign() {
		return maxSign;
	}

	public void setMaxSign(Integer maxSign) {
		this.maxSign = maxSign;
	}

	public Short getLimitMobile() {
		return limitMobile;
	}

	public void setLimitMobile(Short limitMobile) {
		this.limitMobile = limitMobile;
	}

	public String getActivityDetailsHTML() {
		return activityDetailsHTML;
	}

	public void setActivityDetailsHTML(String activityDetailsHTML) {
		this.activityDetailsHTML = activityDetailsHTML;
	}

	public Short getControlLove() {
		return controlLove;
	}

	public void setControlLove(Short controlLove) {
		this.controlLove = controlLove;
	}

	public short getIsPicToSign() {
		return isPicToSign;
	}

	public void setIsPicToSign(short isPicToSign) {
		this.isPicToSign = isPicToSign;
	}

	public int getInUseUnitCount() {
		return inUseUnitCount;
	}

	public void setInUseUnitCount(int inUseUnitCount) {
		this.inUseUnitCount = inUseUnitCount;
	}

	public int getInUseAddressCount() {
		return inUseAddressCount;
	}

	public void setInUseAddressCount(int inUseAddressCount) {
		this.inUseAddressCount = inUseAddressCount;
	}

	public int getInJoinUnitCount() {
		return inJoinUnitCount;
	}

	public void setInJoinUnitCount(int inJoinUnitCount) {
		this.inJoinUnitCount = inJoinUnitCount;
	}

	public Short getTypeTag() {
		return typeTag;
	}

	public void setTypeTag(Short typeTag) {
		this.typeTag = typeTag;
	}

	public Short getAgeFrom() {
		return ageFrom;
	}

	public void setAgeFrom(Short ageFrom) {
		this.ageFrom = ageFrom;
	}

	public Short getAgeEnd() {
		return ageEnd;
	}

	public void setAgeEnd(Short ageEnd) {
		this.ageEnd = ageEnd;
	}

	public String getSmsContent() {
		return smsContent;
	}

	public void setSmsContent(String smsContent) {
		this.smsContent = smsContent;
	}

	public String getSmsCheckContent() {
		return smsCheckContent;
	}

	public void setSmsCheckContent(String smsCheckContent) {
		this.smsCheckContent = smsCheckContent;
	}

	public Short getIs5YuanUser() {
		return is5YuanUser;
	}

	public void setIs5YuanUser(Short is5YuanUser) {
		this.is5YuanUser = is5YuanUser;
	}

	public short getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(short isDelete) {
		this.isDelete = isDelete;
	}
}
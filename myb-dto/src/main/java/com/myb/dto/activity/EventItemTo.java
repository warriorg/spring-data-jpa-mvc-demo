package com.myb.dto.activity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * 活动列表item
 * 
 * @author lijianyu
 * @version create time:2012-12-14 上午11:20:42
 */
public class EventItemTo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 活动id
	 */
	@Setter @Getter
	private long uid;

	/**
	 * 标题
	 */
	@Setter @Getter
	private String title;

	/**
	 * 剩余时间
	 */
	@Setter @Getter
	private String timeRemaining;

	/**
	 * 人气
	 */
	@Setter @Getter
	private Long popularity;

	/**
	 * 活动时间
	 */
	@Setter @Getter
	private String time;

	/**
	 * 地址
	 */
	@Setter @Getter
	private String address;

	/**
	 * 星级
	 */
	@Setter @Getter
	private float star;

	/**
	 * 距离
	 */
	@Setter @Getter
	private String distance;

	/**
	 * 活动是否结束
	 */
	@Setter @Getter
	private boolean isEnd;

	/**
	 * 是否为特约商户
	 */
	@Setter @Getter
	private int isSpecialUnit;

	/**
	 * 公益id
	 */
	@Setter @Getter
	private long communityId;

	/**
	 * 列表图片地址
	 */
	@Setter @Getter
	private String imageAddress;
	
	/**
	 * html网页id标识
	 */
	@SuppressWarnings("unused")
	private String htmlId;

	/**
	 * html网页id标识
	 */
	public String getHtmlId() {
		return uid + "";
	}
}

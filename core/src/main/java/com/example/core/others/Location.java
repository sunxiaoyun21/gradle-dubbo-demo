package com.example.core.others;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 经纬度
 * @author sxy
 * @date 2019/4/2 14:27
 * @version 1.0
 **/
@Data
@Accessors(chain = true)
public class Location {
	/**
	 * 经度
	 */
	private String longitude;
	/**
	 * 纬度
	 */
	private String latitude;
}

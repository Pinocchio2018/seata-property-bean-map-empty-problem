package com.siyu.seatapropertybeanmapemptyproblem.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class QrtzJobDetails implements Serializable {
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 1303148646066656376L;
	
	private String schedName;
	
	private String jobName;
	
	private String jobGroup;

    private String description;

    private String jobClassName;

    private String isDurable;

    private String isNonconcurrent;

    private String isUpdateData;
    
    private String requestsRecovery;
   
    private byte[] jobData;
}
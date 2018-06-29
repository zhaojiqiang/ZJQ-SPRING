package com.zjq.sjms.builder.overwrite;

import java.util.Collection;
import java.util.Map;

import com.zjq.sjms.builder.ExportDataMode1;
import com.zjq.sjms.builder.ExportFooterMode1;
import com.zjq.sjms.builder.ExportHeaderMode1;

/**
 * 指导者，指导生成器的接口来构建输出的文件的对象
 * @author zjq
 *
 */
public class Director {
	
	private Builder builder;

	/**
	 * 构造方法传入生成器对象
	 * @param builder
	 */
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct(ExportHeaderMode1 ehm,Map<String, Collection<ExportDataMode1>> mapData,ExportFooterMode1 efm) {
		builder.builerHeader(ehm);
		builder.builerBody(mapData);
		builder.builerFooter(efm);
	}
	
	
	

}

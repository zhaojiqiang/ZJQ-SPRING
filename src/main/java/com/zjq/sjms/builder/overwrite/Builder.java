package com.zjq.sjms.builder.overwrite;

import java.util.Collection;
import java.util.Map;

import com.zjq.sjms.builder.ExportDataMode1;
import com.zjq.sjms.builder.ExportFooterMode1;
import com.zjq.sjms.builder.ExportHeaderMode1;

/**
 * 生成器接口，定义创建一个输出文件随想所需的各个部件操作
 * @author zjq
 *
 */
public interface Builder {
	
	public void builerHeader(ExportHeaderMode1 ehm);
	
	public void builerBody(Map<String, Collection<ExportDataMode1>> mapData);
	
	public void builerFooter(ExportFooterMode1 efm);



}

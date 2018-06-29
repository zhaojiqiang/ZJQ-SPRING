package com.zjq.sjms.builder.overwrite;

import java.util.Collection;
import java.util.Map;

import com.zjq.sjms.builder.ExportDataMode1;
import com.zjq.sjms.builder.ExportFooterMode1;
import com.zjq.sjms.builder.ExportHeaderMode1;

public class TxtBuilder implements Builder{
	StringBuffer buffer = new StringBuffer();


	@Override
	public void builerHeader(ExportHeaderMode1 ehm) {
		buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");

	}

	@Override
	public void builerBody(Map<String, Collection<ExportDataMode1>> mapData) {
		for (String tabName : mapData.keySet()) {
			buffer.append(tabName + "\n");
			
			for (ExportDataMode1 dataMode1 : mapData.get(tabName)) {
				buffer.append(dataMode1.getProductId() + "," + dataMode1.getPrice()+"," + dataMode1.getAmount()+"\n");
			}
		}
	}

	@Override
	public void builerFooter(ExportFooterMode1 efm) {
		buffer.append(efm.getExportUser());

	}
	public StringBuffer getResult() {
		return buffer;
	}

}

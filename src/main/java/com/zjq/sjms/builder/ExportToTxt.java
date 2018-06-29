package com.zjq.sjms.builder;

import java.util.Collection;
import java.util.Map;

public class ExportToTxt {

	
		public void export(ExportHeaderMode1 ehm,Map<String, Collection<ExportDataMode1>> mapData,ExportFooterMode1 efm) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");
			
			for (String tabName : mapData.keySet()) {
				buffer.append(tabName + "\n");
				
				for (ExportDataMode1 dataMode1 : mapData.get(tabName)) {
					buffer.append(dataMode1.getProductId() + "," + dataMode1.getPrice()+"," + dataMode1.getAmount()+"\n");
				}
			}
			
			buffer.append(efm.getExportUser());
			System.out.println("输出到文本文件的内容：\n"+buffer.toString());
		}
}

package com.zjq.sjms.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Client {

		public static void main(String[] args) {
			
			ExportHeaderMode1 ehm = new ExportHeaderMode1();
			ehm.setDepId("一个分公司");
			ehm.setExportDate("2018-09-09");
			Map<String, Collection<ExportDataMode1>> mapData = new HashMap<>();
			Collection<ExportDataMode1> data = new ArrayList<>();
			mapData.put("赵继强记录表", data);
			ExportDataMode1 exportDataMode1 = new ExportDataMode1();
			exportDataMode1.setProductId("露娜");
			exportDataMode1.setAmount(999);
			exportDataMode1.setPrice(19.36);
			ExportDataMode1 exportDataMode2 = new ExportDataMode1();
			exportDataMode2.setProductId("橘右京");
			exportDataMode2.setAmount(999);
			exportDataMode2.setPrice(19.36);
			data.add(exportDataMode1);
			data.add(exportDataMode2);

			ExportFooterMode1 efm = new ExportFooterMode1();
			efm.setExportUser("赵吉强");
			
			ExportToTxt exportToTxt = new ExportToTxt();
			exportToTxt.export(ehm, mapData, efm);
			System.out.println("---------------------------------------------------------");
			ExportToXml exportToXml = new ExportToXml();
			exportToXml.export(ehm, mapData, efm);
			
		}
}

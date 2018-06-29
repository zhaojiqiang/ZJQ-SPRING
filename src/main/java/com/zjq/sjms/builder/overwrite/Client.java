package com.zjq.sjms.builder.overwrite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.zjq.sjms.builder.ExportDataMode1;
import com.zjq.sjms.builder.ExportFooterMode1;
import com.zjq.sjms.builder.ExportHeaderMode1;
import com.zjq.sjms.builder.ExportToTxt;
import com.zjq.sjms.builder.ExportToXml;

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
			TxtBuilder txtBuilder = new TxtBuilder();
			Director director = new Director(txtBuilder);
			director.construct(ehm, mapData, efm);
			System.out.println(txtBuilder.getResult());
			System.out.println("---------------------------------------------------------");
			XmlBuilder xmlBuilder = new XmlBuilder();
			Director director2 = new Director(xmlBuilder);
			director2.construct(ehm, mapData, efm);
			System.out.println(xmlBuilder.getResult());

			
		}
}

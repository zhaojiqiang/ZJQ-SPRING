package com.zjq.sjms.builder;

import java.util.Collection;
import java.util.Map;

public class ExportToXml {

	
		public void export(ExportHeaderMode1 ehm,Map<String, Collection<ExportDataMode1>> mapData,ExportFooterMode1 efm) {
			StringBuffer buffer = new StringBuffer();
			buffer.append("<?xml version='1.0' encoding='gb2312'?>\n");
			buffer.append("<Report>\n");
			buffer.append("	 <Header>\n");
			buffer.append("  	<DepId>" + ehm.getDepId() + "</DepId>\n");
			buffer.append("  	<ExportDate>" + ehm.getExportDate() + "</ExportDate>\n");
			buffer.append("	 </Header>\n");
			buffer.append("	 <body>\n");
				for (String tabName : mapData.keySet()) {
					buffer.append("	 	<Datas TableName=\""+tabName+"\">\n");
					for (ExportDataMode1 dataMode1 : mapData.get(tabName)) {
						buffer.append("			<Data>\n");
						buffer.append("				<ProductId>"+dataMode1.getProductId()+"</ProductId>\n");
						buffer.append("				<Price>"+dataMode1.getPrice()+"</Price>\n");
						buffer.append("				<Amount>"+dataMode1.getAmount()+"</Amount>\n");
						buffer.append("			</Data>\n");

					}
					buffer.append("	 	</Datas>\n");
				}
			buffer.append("	 </body>\n");
			buffer.append("	 <Footer>\n");
			buffer.append("	 	<ExportUser>"+efm.getExportUser()+"</ExportUser>\n");
			buffer.append("	 </Footer>\n");
			buffer.append("</Report>\n");

			System.out.println("输出到XML文件的内容：\n"+buffer.toString());



		}
}

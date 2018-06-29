package com.zjq.sjms.builder.overwrite;

import java.util.Collection;
import java.util.Map;

import com.zjq.sjms.builder.ExportDataMode1;
import com.zjq.sjms.builder.ExportFooterMode1;
import com.zjq.sjms.builder.ExportHeaderMode1;

public class XmlBuilder implements Builder{
	StringBuffer buffer = new StringBuffer();


	@Override
	public void builerHeader(ExportHeaderMode1 ehm) {
		buffer.append("<?xml version='1.0' encoding='gb2312'?>\n");
		buffer.append("<Report>\n");
		buffer.append("	 <Header>\n");
		buffer.append("  	<DepId>" + ehm.getDepId() + "</DepId>\n");
		buffer.append("  	<ExportDate>" + ehm.getExportDate() + "</ExportDate>\n");
		buffer.append("	 </Header>\n");

	}

	@Override
	public void builerBody(Map<String, Collection<ExportDataMode1>> mapData) {
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
	}

	@Override
	public void builerFooter(ExportFooterMode1 efm) {
		buffer.append("	 </body>\n");
		buffer.append("	 <Footer>\n");
		buffer.append("	 	<ExportUser>"+efm.getExportUser()+"</ExportUser>\n");
		buffer.append("	 </Footer>\n");
		buffer.append("</Report>\n");
	}
	
	public StringBuffer getResult() {
		return buffer;
	}

}

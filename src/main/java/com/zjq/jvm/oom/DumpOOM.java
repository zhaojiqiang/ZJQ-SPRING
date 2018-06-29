package com.zjq.jvm.oom;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DumpOOM {
 static class OOMObject{
	 
 }
 
 public static void main(String[] args) {
	List<OOMObject> a = new ArrayList<OOMObject>();
	for (;;) {
		a.add(new OOMObject());
	}
}
} 
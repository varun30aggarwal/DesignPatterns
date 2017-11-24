package Structural.Bridge;

import java.util.List;

public class PrintFormatter implements Formatter {

	@Override
	public String Format(String header, List<Detail> details) {
		// TODO Auto-generated method stub
		
			StringBuilder builder = new StringBuilder();
			builder.append(header);
			builder.append("\n");

			for (Detail detail : details) {
				builder.append(detail.getLabel());
				builder.append(":");
				builder.append(detail.getValue());
				builder.append("\n");
			}

			return builder.toString();
		}

	

}

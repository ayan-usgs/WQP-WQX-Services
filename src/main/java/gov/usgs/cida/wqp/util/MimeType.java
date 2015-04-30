package gov.usgs.cida.wqp.util;

import org.springframework.http.MediaType;


public enum MimeType implements HttpConstants {

	csv(MIME_TYPE_TEXT_CSV),
	json(MIME_TYPE_JSON),
	tsv(MIME_TYPE_TEXT_TSV),
	xlsx(MIME_TYPE_XLSX),
	xml(MIME_TYPE_XML),
	zip(MIME_TYPE_ZIP);

	
	public final String mimeType;
	public final MediaType mediaType;
	
	private MimeType(String mimeType) {
		this.mimeType  = mimeType;
		String[] parts = mimeType.split("/");
		this.mediaType = new MediaType(parts[0],parts[1]);
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public String getExtension() {
		return this.toString();
	}
	
	public MediaType getMediaType() {
		return mediaType;
	}
	
	public MimeType fromString(String mimeType) {
		MimeType type = this;
		try {
			type = MimeType.valueOf(mimeType);
		} catch (Exception e) {
			for (MimeType aType : MimeType.values()) {
				if (aType.mimeType.equalsIgnoreCase(mimeType)) {
					return aType;
				}
			}
		}
		return type;
	}
	
}

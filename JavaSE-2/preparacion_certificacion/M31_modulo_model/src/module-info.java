module model.module {
	requires java.persistence;
	requires lombok;
	requires com.google.gson;
	exports helpers;
	exports serializacion;
	exports model;
}
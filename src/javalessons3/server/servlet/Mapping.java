package javalessons3.server.servlet;

import java.util.HashSet;
import java.util.Set;

public class Mapping {
	private String name;
	private Set<String> urls = new HashSet<>();

	public Mapping() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getUrls() {
		return urls;
	}

	public void setUrls(Set<String> urls) {
		this.urls = urls;
	}

	public void addUrl(String url) {
		this.urls.add(url);
	}
}

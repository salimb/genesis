package com.uk.genesis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;

public class GenesisNamespaceContext implements NamespaceContext {
	private Map<String, String> mappedNamespaces = new HashMap<String, String>();
	
	public GenesisNamespaceContext() {
		mappedNamespaces.put("genesis", "http://genesis.uk.com/schemas/1.0/genesis-root");
	}
	
	public String getNamespaceURI(String prefix) {
		if (mappedNamespaces.containsKey(prefix)) {
			return mappedNamespaces.get(prefix);
		}
		
		return XMLConstants.NULL_NS_URI;
	}

	public String getPrefix(String s) {
		throw new UnsupportedOperationException();
	}

	public Iterator getPrefixes(String s) {
		throw new UnsupportedOperationException();
	}
	
	public void addNamespace(String prefix, String uri) {
		mappedNamespaces.put(prefix, uri);
	}
}

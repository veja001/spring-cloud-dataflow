/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.dataflow.shell.command.support;

import org.springframework.util.Assert;

/**
 * @author Gunnar Hillert
 */
public enum RoleType {

	VIEW("ROLE_VIEW", "view role"),
	CREATE("ROLE_CREATE", "role for create operations"),
	MANAGE("ROLE_MANAGE", "role for the boot management endpoints");

	private String key;

	private String name;

	/**
	 * Constructor.
	 */
	RoleType(final String key, final String name) {
		this.key = key;
		this.name = name;
	}

	public static RoleType fromKey(String role) {

		Assert.hasText(role, "Parameter role must not be null or empty.");

		for (RoleType roleType : RoleType.values()) {
			if (roleType.getKey().equals(role)) {
				return roleType;
			}
		}

		return null;
	}

	public String getKey() {
		return key;
	}

	public String getName() {
		return name;
	}
}

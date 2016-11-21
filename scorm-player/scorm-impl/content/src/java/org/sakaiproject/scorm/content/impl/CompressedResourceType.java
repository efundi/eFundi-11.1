/*
 * #%L
 * SCORM Content Impl
 * %%
 * Copyright (C) 2007 - 2016 Sakai Project
 * %%
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *             http://opensource.org/licenses/ecl2
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.sakaiproject.scorm.content.impl;

import java.util.ArrayList;
import java.util.List;

import org.sakaiproject.content.api.ContentEntity;
import org.sakaiproject.content.api.ResourceToolAction;
import org.sakaiproject.content.util.BaseInteractionAction;
import org.sakaiproject.content.util.BaseServiceLevelAction;
import org.sakaiproject.entity.api.ResourceProperties;

public class CompressedResourceType extends BaseResourceType {
	public static final String COMPRESSED_ITEM_LABEL = "Zip Entry";

	public static final String COMPRESSED_ITEM_TYPE_ID = "org.sakaiproject.content.types.zipEntry";

	public static final String COMPRESSED_ITEM_HELPER_ID = "sakai.zipentry.helper";

	public CompressedResourceType() {
		List<String> requiredKeys = new ArrayList<String>();
		requiredKeys.add(ResourceProperties.PROP_STRUCTOBJ_TYPE);

		ResourceToolAction create = new BaseInteractionAction(ResourceToolAction.CREATE, ResourceToolAction.ActionType.NEW_UPLOAD, COMPRESSED_ITEM_TYPE_ID,
		        COMPRESSED_ITEM_HELPER_ID, requiredKeys) {

			@Override
			public String getLabel() {
				return "Add file(s)";
			}

		};

		ResourceToolAction remove = new BaseServiceLevelAction(ResourceToolAction.DELETE, ResourceToolAction.ActionType.DELETE, COMPRESSED_ITEM_TYPE_ID, false);

		actionMap.put(create.getActionType(), makeList(create));
		actionMap.put(remove.getActionType(), makeList(remove));

		actions.put(create.getId(), create);
		actions.put(remove.getId(), remove);
	}

	public String getId() {
		return COMPRESSED_ITEM_TYPE_ID;
	}

	public String getLabel() {
		return COMPRESSED_ITEM_LABEL;
	}

	public String getLocalizedHoverText(ContentEntity entity) {
		return COMPRESSED_ITEM_LABEL;
	}

	public String getLongSizeLabel(ContentEntity entity) {
		return "files";
	}

	public String getSizeLabel(ContentEntity entity) {
		return "files";
	}

}
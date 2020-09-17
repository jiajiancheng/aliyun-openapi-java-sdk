/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutAonetenantpathiterationsRequest extends RpcAcsRequest<GetLinkeBahamutAonetenantpathiterationsResponse> {
	   

	private String value;

	private String tenantPath;

	private String q;
	public GetLinkeBahamutAonetenantpathiterationsRequest() {
		super("SOFA", "2019-08-15", "GetLinkeBahamutAonetenantpathiterations", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putBodyParameter("Value", value);
		}
	}

	public String getTenantPath() {
		return this.tenantPath;
	}

	public void setTenantPath(String tenantPath) {
		this.tenantPath = tenantPath;
		if(tenantPath != null){
			putBodyParameter("TenantPath", tenantPath);
		}
	}

	public String getQ() {
		return this.q;
	}

	public void setQ(String q) {
		this.q = q;
		if(q != null){
			putBodyParameter("Q", q);
		}
	}

	@Override
	public Class<GetLinkeBahamutAonetenantpathiterationsResponse> getResponseClass() {
		return GetLinkeBahamutAonetenantpathiterationsResponse.class;
	}

}

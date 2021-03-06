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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.StartLinkeBahamutPrepubpipelineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartLinkeBahamutPrepubpipelineResponseUnmarshaller {

	public static StartLinkeBahamutPrepubpipelineResponse unmarshall(StartLinkeBahamutPrepubpipelineResponse startLinkeBahamutPrepubpipelineResponse, UnmarshallerContext _ctx) {
		
		startLinkeBahamutPrepubpipelineResponse.setRequestId(_ctx.stringValue("StartLinkeBahamutPrepubpipelineResponse.RequestId"));
		startLinkeBahamutPrepubpipelineResponse.setResultCode(_ctx.stringValue("StartLinkeBahamutPrepubpipelineResponse.ResultCode"));
		startLinkeBahamutPrepubpipelineResponse.setResultMessage(_ctx.stringValue("StartLinkeBahamutPrepubpipelineResponse.ResultMessage"));
		startLinkeBahamutPrepubpipelineResponse.setErrorMessage(_ctx.stringValue("StartLinkeBahamutPrepubpipelineResponse.ErrorMessage"));
		startLinkeBahamutPrepubpipelineResponse.setErrorMsgParamsMap(_ctx.stringValue("StartLinkeBahamutPrepubpipelineResponse.ErrorMsgParamsMap"));
		startLinkeBahamutPrepubpipelineResponse.setMessage(_ctx.stringValue("StartLinkeBahamutPrepubpipelineResponse.Message"));
		startLinkeBahamutPrepubpipelineResponse.setResponseStatusCode(_ctx.longValue("StartLinkeBahamutPrepubpipelineResponse.ResponseStatusCode"));
		startLinkeBahamutPrepubpipelineResponse.setSuccess(_ctx.booleanValue("StartLinkeBahamutPrepubpipelineResponse.Success"));
	 
	 	return startLinkeBahamutPrepubpipelineResponse;
	}
}
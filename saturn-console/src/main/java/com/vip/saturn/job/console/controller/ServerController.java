/**
 * Copyright 2016 vip.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * </p>
 */

package com.vip.saturn.job.console.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vip.saturn.job.console.service.JobOperationService;
import com.vip.saturn.job.console.service.ServerDimensionService;

@RestController
@RequestMapping("server")
public class ServerController extends AbstractController {

	protected static Logger LOGGER = LoggerFactory.getLogger(ServerController.class);

	@Resource
	private ServerDimensionService serverDimensionService;

	@Resource
	private JobOperationService jobOperationService;

	@RequestMapping(value = "servers", method = RequestMethod.GET)
	public Map<String, Object> getAllServersBriefInfo(final HttpServletRequest request) {
		return serverDimensionService.getAllServersBriefInfo();
	}

}

/**
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 			http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.nanoframework.core.chain.exception;

/**
 * @author yanghe
 * @date 2015年12月3日 下午1:53:10
 */
public class ChainStepInvokeException extends ChainException {
	private static final long serialVersionUID = -3381660110035549789L;

	public ChainStepInvokeException() {
		super();
	}

	public ChainStepInvokeException(String message) {
		super(message);
	}

	public ChainStepInvokeException(String message, Throwable cause) {
		super(message, cause);
	}

	public ChainStepInvokeException(Throwable cause) {
		super(cause);
	}

	protected ChainStepInvokeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}

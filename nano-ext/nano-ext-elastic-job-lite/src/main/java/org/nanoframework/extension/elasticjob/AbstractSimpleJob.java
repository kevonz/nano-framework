/*
 * Copyright © 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.nanoframework.extension.elasticjob;

import com.google.inject.Injector;
import org.nanoframework.core.globals.Globals;

/**
 * 简单分布式作业抽象类.
 *
 * @author wangtong
 * @since 1.4.11
 */
public abstract class AbstractSimpleJob implements com.dangdang.ddframe.job.api.simple.SimpleJob {

    public AbstractSimpleJob() {
        Globals.get(Injector.class).injectMembers(this);
    }
}

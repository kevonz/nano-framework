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
package org.nanoframework.extension.elasticjob.tests.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import org.nanoframework.commons.support.logging.Logger;
import org.nanoframework.commons.support.logging.LoggerFactory;
import org.nanoframework.extension.elasticjob.AbstractDataflowJob;
import org.nanoframework.extension.elasticjob.ElasticJob;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author wangtong
 * @since 1.4.11
 */
@ElasticJob("1")
public class TestDataflowJob extends AbstractDataflowJob {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestDataflowJob.class);
    public static volatile boolean completed;

    @Override
    public List fetchData(ShardingContext shardingContext) {
        LOGGER.info("作业类型：dataflow fetchData 运行时间：{} 分片信息：{}", new Date(), shardingContext.toString());
        if (completed) {
            return Collections.emptyList();
        }
        return Collections.singletonList("data");
    }

    @Override
    public void processData(ShardingContext shardingContext, List data) {
        LOGGER.info("作业类型：dataflow processData 运行时间：{} 分片信息：{}", new Date(), shardingContext.toString());
        completed = true;
    }

}

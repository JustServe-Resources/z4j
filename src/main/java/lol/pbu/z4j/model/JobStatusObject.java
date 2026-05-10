/*
 * Copyright 2026 Peanut Butter Unicorn, LLC
 *
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
package lol.pbu.z4j.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.*;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.Valid;
import io.micronaut.core.annotation.Nullable;

/**
 * JobStatusObject
 * @author Kody Krauss
 */
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPropertyOrder({
        JobStatusObject.JSON_PROPERTY_ID,
        JobStatusObject.JSON_PROPERTY_JOB_TYPE,
        JobStatusObject.JSON_PROPERTY_MESSAGE,
        JobStatusObject.JSON_PROPERTY_PROGRESS,
        JobStatusObject.JSON_PROPERTY_RESULTS,
        JobStatusObject.JSON_PROPERTY_STATUS,
        JobStatusObject.JSON_PROPERTY_TOTAL,
        JobStatusObject.JSON_PROPERTY_URL,
})
@Serdeable
public class JobStatusObject {

    public static final String JSON_PROPERTY_ID = "id";
    public static final String JSON_PROPERTY_JOB_TYPE = "job_type";
    public static final String JSON_PROPERTY_MESSAGE = "message";
    public static final String JSON_PROPERTY_PROGRESS = "progress";
    public static final String JSON_PROPERTY_RESULTS = "results";
    public static final String JSON_PROPERTY_STATUS = "status";
    public static final String JSON_PROPERTY_TOTAL = "total";
    public static final String JSON_PROPERTY_URL = "url";

    /**
     * Automatically assigned when the job is queued
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String id;

    /**
     * The type of the job
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_JOB_TYPE)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String jobType;

    /**
     * Message from the job worker, if any
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String message;

    /**
     * Number of tasks that have already been completed
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROGRESS)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private Integer progress;

    @Nullable
    @Valid
    @JsonProperty(JSON_PROPERTY_RESULTS)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private JobStatusObjectResults results;

    /**
     * The current status. One of the following: \"queued\", \"working\", \"failed\", \"completed\"
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String status;

    /**
     * The total number of tasks this job is batching through
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_TOTAL)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private Integer total;

    /**
     * The URL to poll for status updates
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String url;

}
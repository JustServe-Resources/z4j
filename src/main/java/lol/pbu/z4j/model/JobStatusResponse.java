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
 * JobStatusResponse
 * @author Kody Krauss
 */
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPropertyOrder(JobStatusResponse.JSON_PROPERTY_JOB_STATUS)
@Serdeable
public class JobStatusResponse {

    public static final String JSON_PROPERTY_JOB_STATUS = "job_status";

    @Nullable
    @Valid
    @JsonProperty(JSON_PROPERTY_JOB_STATUS)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private JobStatusObject jobStatus;

}
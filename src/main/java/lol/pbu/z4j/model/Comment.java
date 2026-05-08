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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * Comment
 *
 * @author Jonathan-Zollinger
 * @since 0.1.1
 */
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ToString
@Getter
@Setter
@JsonPropertyOrder({
        Comment.JSON_PROPERTY_BODY,
        Comment.JSON_PROPERTY_LOCALE,
        Comment.JSON_PROPERTY_AUTHOR_ID,
        Comment.JSON_PROPERTY_CREATED_AT,
        Comment.JSON_PROPERTY_HTML_URL,
        Comment.JSON_PROPERTY_ID,
        Comment.JSON_PROPERTY_NON_AUTHOR_EDITOR_ID,
        Comment.JSON_PROPERTY_NON_AUTHOR_UPDATED_AT,
        Comment.JSON_PROPERTY_SOURCE_ID,
        Comment.JSON_PROPERTY_SOURCE_TYPE,
        Comment.JSON_PROPERTY_UPDATED_AT,
        Comment.JSON_PROPERTY_URL,
        Comment.JSON_PROPERTY_VOTE_COUNT,
        Comment.JSON_PROPERTY_VOTE_SUM,
})
@Serdeable
public class Comment extends AbstractComment {

    public static final String JSON_PROPERTY_LOCALE = "locale";
    public static final String JSON_PROPERTY_SOURCE_ID = "source_id";
    public static final String JSON_PROPERTY_SOURCE_TYPE = "source_type";

    /**
     * The locale in which this comment was made
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_LOCALE)
    private LocaleAbbreviation localeAbbreviation;

    /**
     * The id of the item on which this comment was made
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_SOURCE_ID)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private Long sourceId;

    /**
     * The type of the item on which this comment was made. Currently only supports 'Article'
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String sourceType;

}

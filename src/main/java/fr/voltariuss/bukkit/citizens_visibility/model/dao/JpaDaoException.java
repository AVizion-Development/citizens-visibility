/*
 * Copyright (c) 2022 - Loïc DUBOIS-TERMOZ
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

package fr.voltariuss.bukkit.citizens_visibility.model.dao;

import com.google.common.base.Preconditions;
import org.jetbrains.annotations.NotNull;

public class JpaDaoException extends RuntimeException {

  public JpaDaoException(@NotNull String message) {
    super(message);
  }

  public JpaDaoException(@NotNull String message, @NotNull Throwable cause) {
    super(message, cause);
  }
}

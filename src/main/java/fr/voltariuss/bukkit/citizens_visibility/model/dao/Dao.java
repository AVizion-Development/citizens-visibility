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

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public interface Dao<T, I extends Serializable> {

  @NotNull
  Optional<T> findById(@NotNull I id);

  @NotNull
  List<T> findAll();

  void persist(@NotNull T entity);

  void update(@NotNull T entity);

  void delete(@NotNull T entity);
}

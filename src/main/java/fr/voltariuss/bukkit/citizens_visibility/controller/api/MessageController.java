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

package fr.voltariuss.bukkit.citizens_visibility.controller.api;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

public interface MessageController {

  void sendInfoMessage(@NotNull Audience audience, @NotNull Component message);

  void sendSuccessMessage(@NotNull Audience audience, @NotNull Component message);

  void sendFailureMessage(@NotNull Audience audience, @NotNull Component message);

  void sendWarningMessage(@NotNull Audience audience, @NotNull Component message);

  void sendErrorMessage(@NotNull Audience audience, @NotNull Component message);

  void sendRawMessage(@NotNull Audience audience, @NotNull Component message);

  void sendConsoleMessage(@NotNull Component message);

  void broadcastMessage(@NotNull Component message);
}

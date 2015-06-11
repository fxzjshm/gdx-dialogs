/*******************************************************************************
 * Copyright 2015 See AUTHORS file.
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
 ******************************************************************************/

package de.tomgrill.gdxdialogs.desktop;

import de.tomgrill.gdxdialogs.core.DialogManager;
import de.tomgrill.gdxdialogs.core.dialogs.ButtonDialog;
import de.tomgrill.gdxdialogs.core.dialogs.ProgressDialog;
import de.tomgrill.gdxdialogs.desktop.dialogs.DesktopButtonDialog;
import de.tomgrill.gdxdialogs.desktop.dialogs.DesktopProgressDialog;

public class DesktopDialogManager extends DialogManager {

	@Override
	public ButtonDialog newButtonDialog() {
		return new DesktopButtonDialog();
	}

	@Override
	public ProgressDialog newProgressDialog() {
		return new DesktopProgressDialog();
	}

}

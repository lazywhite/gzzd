/*
 * Copyright (C) 2019 Qunar, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package qunar.tc.bistoury.application.k8s.dao;

import java.util.List;

/**
 * @author leix.xie
 * @date 2019/7/2 11:14
 * @describe
 */
public interface ApplicationUserDao {
    List<String> getAppCodesByUserCode(String userCode);

    List<String> getUsersByAppCode(String appCode);

    int addAppUser(String userCode, String appCode);

    void batchAddAppUser(List<String> userCodes, String addCode);

    int removeAppUser(String userCode, String appCode);
}

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * © COPYRIGHT 2021 Corporation CAICT All rights reserved.
 * http://www.caict.ac.cn
 */
package cn.bif.module.encryption.crypto.slip10;

public enum Slip10Curve {
    SECP256K1("Bitcoin seed"),
    ED25519("ed25519 seed"),
    NIST256P1("Nist256p1 seed"),
    SM2("SM2 seed");

    public String getKey() {
        return key;
    }

    public final String key;

    Slip10Curve(String key) {
        this.key = key;
    }

    public static Boolean contains(String value) {
        for (Slip10Curve e : Slip10Curve.values()) {
            if (e.name().equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }

    public static String getValue(String name) {
        for (Slip10Curve e : Slip10Curve.values()) {
            if (e.name().equalsIgnoreCase(name)) {
                return e.key;
            }
        }
        return null;
    }
}

/*
 * This file is part of the ThreatModeling SDK.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.springett.threatmodeling.tools.mstmt2016.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "DrawingSurfaceModel")
public class DrawingSurfaceModel {

    private List<Border> borders;

    public List<Border> getBorders() {
        return borders;
    }

    @XmlElementWrapper(name = "Borders")
    @XmlElement(name = "KeyValueOfguidanyType", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
    public void setBorders(List<Border> borders) {
        this.borders = borders;
    }
}

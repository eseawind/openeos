/**
 * Copyright 2014 Fernando Rincon Martin <frm.rincon@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openeos.erp.sales.model.aspects;

import org.openeos.erp.sales.model.Tax;
import org.openeos.services.dictionary.validation.annotations.SQLValidation;

public aspect TaxValidationAspect {

	declare @method: public * Tax.getRegionByToCRegionId() : @SQLValidation("{alias}.c_country_id=@source.countryByToCCountryId.id@");
	//declare @method: public * Tax.getRegionByToCRegionId() : @ELValidation("parameter.country.id=source.countryByToCCountryId.id");
	declare @method: public * Tax.getRegionByCRegionId() : @SQLValidation("{alias}.c_country_id=@source.countryByCCountryId.id@");
	//declare @method: public * Tax.getRegionByCRegionId() : @ELValidation("parameter.country.id=source.countryByCCountryId.id");

}
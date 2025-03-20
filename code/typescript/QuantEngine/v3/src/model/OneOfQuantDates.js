/**
 * Quant API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.12.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import QuantDateList from './QuantDateList';
import QuantFdsDate from './QuantFdsDate';

/**
 * The OneOfQuantDates model module.
 * @module model/OneOfQuantDates
 */
class OneOfQuantDates {
    /**
     * Constructs a new <code>OneOfQuantDates</code>.
     * @alias module:model/OneOfQuantDates
     * @implements module:model/QuantFdsDate
     * @implements module:model/QuantDateList
     * @param source {module:model/OneOfQuantDates.SourceEnum} 
     * @param frequency {String} 
     * @param calendar {String} 
     */
    constructor(source, frequency, calendar) { 
        QuantFdsDate.initialize(this, source, frequency, calendar);QuantDateList.initialize(this, source, frequency, calendar);
        OneOfQuantDates.initialize(this, source, frequency, calendar);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, source, frequency, calendar) { 
        obj['source'] = source;
        obj['frequency'] = frequency;
        obj['calendar'] = calendar;
    }

    /**
     * Constructs a <code>OneOfQuantDates</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OneOfQuantDates} obj Optional instance to populate.
     * @return {module:model/OneOfQuantDates} The populated <code>OneOfQuantDates</code> instance.
     */
    static constructFromObject(data, obj) {
        switch (data['source']) {
            case 'DateList':
              return QuantDateList.constructFromObject(data, obj);
            case 'FdsDate':
              return QuantFdsDate.constructFromObject(data, obj);
        }
        return obj;
    }


}

/**
 * @member {module:model/OneOfQuantDates.SourceEnum} source
 */
OneOfQuantDates.prototype['source'] = undefined;

/**
 * @member {String} frequency
 */
OneOfQuantDates.prototype['frequency'] = undefined;

/**
 * @member {String} calendar
 */
OneOfQuantDates.prototype['calendar'] = undefined;

/**
 * @member {Boolean} overrideUniversalScreenCalendar
 */
OneOfQuantDates.prototype['overrideUniversalScreenCalendar'] = undefined;


// Implement QuantFdsDate interface:
/**
 * @member {module:model/QuantFdsDate.SourceEnum} source
 */
QuantFdsDate.prototype['source'] = undefined;
/**
 * @member {String} frequency
 */
QuantFdsDate.prototype['frequency'] = undefined;
/**
 * @member {String} calendar
 */
QuantFdsDate.prototype['calendar'] = undefined;
/**
 * @member {Boolean} overrideUniversalScreenCalendar
 */
QuantFdsDate.prototype['overrideUniversalScreenCalendar'] = undefined;
// Implement QuantDateList interface:
/**
 * @member {module:model/QuantDateList.SourceEnum} source
 */
QuantDateList.prototype['source'] = undefined;
/**
 * @member {String} frequency
 */
QuantDateList.prototype['frequency'] = undefined;
/**
 * @member {String} calendar
 */
QuantDateList.prototype['calendar'] = undefined;
/**
 * @member {Boolean} overrideUniversalScreenCalendar
 */
QuantDateList.prototype['overrideUniversalScreenCalendar'] = undefined;



/**
 * Allowed values for the <code>source</code> property.
 * @enum {String}
 * @readonly
 */
OneOfQuantDates['SourceEnum'] = {

    /**
     * value: "FdsDate"
     * @const
     */
    "FdsDate": "FdsDate",

    /**
     * value: "DateList"
     * @const
     */
    "DateList": "DateList"
};



export default OneOfQuantDates;


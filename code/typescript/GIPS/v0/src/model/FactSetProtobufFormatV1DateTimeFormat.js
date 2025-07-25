/**
 * GIPS API
 * Allow clients to use GIPS through APIs.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FactSetProtobufFormatV1DateTimeFormat model module.
 * @module model/FactSetProtobufFormatV1DateTimeFormat
 */
class FactSetProtobufFormatV1DateTimeFormat {
    /**
     * Constructs a new <code>FactSetProtobufFormatV1DateTimeFormat</code>.
     * @alias module:model/FactSetProtobufFormatV1DateTimeFormat
     */
    constructor() { 
        
        FactSetProtobufFormatV1DateTimeFormat.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FactSetProtobufFormatV1DateTimeFormat</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FactSetProtobufFormatV1DateTimeFormat} obj Optional instance to populate.
     * @return {module:model/FactSetProtobufFormatV1DateTimeFormat} The populated <code>FactSetProtobufFormatV1DateTimeFormat</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FactSetProtobufFormatV1DateTimeFormat();

            if (data.hasOwnProperty('shortDateCustomFormatString')) {
                obj['shortDateCustomFormatString'] = ApiClient.convertToType(data['shortDateCustomFormatString'], 'String');
            }
            if (data.hasOwnProperty('longDateCustomFormatString')) {
                obj['longDateCustomFormatString'] = ApiClient.convertToType(data['longDateCustomFormatString'], 'String');
            }
            if (data.hasOwnProperty('shortTimeCustomFormatString')) {
                obj['shortTimeCustomFormatString'] = ApiClient.convertToType(data['shortTimeCustomFormatString'], 'String');
            }
            if (data.hasOwnProperty('longTimeCustomFormatString')) {
                obj['longTimeCustomFormatString'] = ApiClient.convertToType(data['longTimeCustomFormatString'], 'String');
            }
            if (data.hasOwnProperty('monthDayCustomFormatString')) {
                obj['monthDayCustomFormatString'] = ApiClient.convertToType(data['monthDayCustomFormatString'], 'String');
            }
            if (data.hasOwnProperty('yearMonthCustomFormatString')) {
                obj['yearMonthCustomFormatString'] = ApiClient.convertToType(data['yearMonthCustomFormatString'], 'String');
            }
            if (data.hasOwnProperty('dayNames')) {
                obj['dayNames'] = ApiClient.convertToType(data['dayNames'], ['String']);
            }
            if (data.hasOwnProperty('abbreviatedDayNames')) {
                obj['abbreviatedDayNames'] = ApiClient.convertToType(data['abbreviatedDayNames'], ['String']);
            }
            if (data.hasOwnProperty('monthNames')) {
                obj['monthNames'] = ApiClient.convertToType(data['monthNames'], ['String']);
            }
            if (data.hasOwnProperty('abbreviatedMonthNames')) {
                obj['abbreviatedMonthNames'] = ApiClient.convertToType(data['abbreviatedMonthNames'], ['String']);
            }
            if (data.hasOwnProperty('monthGenitiveNames')) {
                obj['monthGenitiveNames'] = ApiClient.convertToType(data['monthGenitiveNames'], ['String']);
            }
            if (data.hasOwnProperty('abbreviatedMonthGenitiveNames')) {
                obj['abbreviatedMonthGenitiveNames'] = ApiClient.convertToType(data['abbreviatedMonthGenitiveNames'], ['String']);
            }
            if (data.hasOwnProperty('amDesignator')) {
                obj['amDesignator'] = ApiClient.convertToType(data['amDesignator'], 'String');
            }
            if (data.hasOwnProperty('pmDesignator')) {
                obj['pmDesignator'] = ApiClient.convertToType(data['pmDesignator'], 'String');
            }
            if (data.hasOwnProperty('dateSeparator')) {
                obj['dateSeparator'] = ApiClient.convertToType(data['dateSeparator'], 'String');
            }
            if (data.hasOwnProperty('timeSeparator')) {
                obj['timeSeparator'] = ApiClient.convertToType(data['timeSeparator'], 'String');
            }
            if (data.hasOwnProperty('fractionalSecondsSeparator')) {
                obj['fractionalSecondsSeparator'] = ApiClient.convertToType(data['fractionalSecondsSeparator'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} shortDateCustomFormatString
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['shortDateCustomFormatString'] = undefined;

/**
 * @member {String} longDateCustomFormatString
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['longDateCustomFormatString'] = undefined;

/**
 * @member {String} shortTimeCustomFormatString
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['shortTimeCustomFormatString'] = undefined;

/**
 * @member {String} longTimeCustomFormatString
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['longTimeCustomFormatString'] = undefined;

/**
 * @member {String} monthDayCustomFormatString
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['monthDayCustomFormatString'] = undefined;

/**
 * @member {String} yearMonthCustomFormatString
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['yearMonthCustomFormatString'] = undefined;

/**
 * @member {Array.<String>} dayNames
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['dayNames'] = undefined;

/**
 * @member {Array.<String>} abbreviatedDayNames
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['abbreviatedDayNames'] = undefined;

/**
 * @member {Array.<String>} monthNames
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['monthNames'] = undefined;

/**
 * @member {Array.<String>} abbreviatedMonthNames
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['abbreviatedMonthNames'] = undefined;

/**
 * @member {Array.<String>} monthGenitiveNames
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['monthGenitiveNames'] = undefined;

/**
 * @member {Array.<String>} abbreviatedMonthGenitiveNames
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['abbreviatedMonthGenitiveNames'] = undefined;

/**
 * @member {String} amDesignator
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['amDesignator'] = undefined;

/**
 * @member {String} pmDesignator
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['pmDesignator'] = undefined;

/**
 * @member {String} dateSeparator
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['dateSeparator'] = undefined;

/**
 * @member {String} timeSeparator
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['timeSeparator'] = undefined;

/**
 * @member {String} fractionalSecondsSeparator
 */
FactSetProtobufFormatV1DateTimeFormat.prototype['fractionalSecondsSeparator'] = undefined;






export default FactSetProtobufFormatV1DateTimeFormat;


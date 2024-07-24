/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.15.6
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CalculationMeta model module.
 * @module model/CalculationMeta
 */
class CalculationMeta {
    /**
     * Constructs a new <code>CalculationMeta</code>.
     * @alias module:model/CalculationMeta
     */
    constructor() { 
        
        CalculationMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CalculationMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CalculationMeta} obj Optional instance to populate.
     * @return {module:model/CalculationMeta} The populated <code>CalculationMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CalculationMeta();

            if (data.hasOwnProperty('contentorganization')) {
                obj['contentorganization'] = ApiClient.convertToType(data['contentorganization'], 'String');
            }
            if (data.hasOwnProperty('stachContentOrganization')) {
                obj['stachContentOrganization'] = ApiClient.convertToType(data['stachContentOrganization'], 'String');
            }
            if (data.hasOwnProperty('contenttype')) {
                obj['contenttype'] = ApiClient.convertToType(data['contenttype'], 'String');
            }
            if (data.hasOwnProperty('format')) {
                obj['format'] = ApiClient.convertToType(data['format'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/CalculationMeta.ContentorganizationEnum} contentorganization
 * @default 'SimplifiedRow'
 */
CalculationMeta.prototype['contentorganization'] = 'SimplifiedRow';

/**
 * @member {module:model/CalculationMeta.StachContentOrganizationEnum} stachContentOrganization
 * @default 'SimplifiedRow'
 */
CalculationMeta.prototype['stachContentOrganization'] = 'SimplifiedRow';

/**
 * @member {module:model/CalculationMeta.ContenttypeEnum} contenttype
 * @default 'Json'
 */
CalculationMeta.prototype['contenttype'] = 'Json';

/**
 * @member {module:model/CalculationMeta.FormatEnum} format
 * @default 'JsonStach'
 */
CalculationMeta.prototype['format'] = 'JsonStach';





/**
 * Allowed values for the <code>contentorganization</code> property.
 * @enum {String}
 * @readonly
 */
CalculationMeta['ContentorganizationEnum'] = {

    /**
     * value: "None"
     * @const
     */
    "None": "None",

    /**
     * value: "Row"
     * @const
     */
    "Row": "Row",

    /**
     * value: "Column"
     * @const
     */
    "Column": "Column",

    /**
     * value: "SimplifiedRow"
     * @const
     */
    "SimplifiedRow": "SimplifiedRow"
};


/**
 * Allowed values for the <code>stachContentOrganization</code> property.
 * @enum {String}
 * @readonly
 */
CalculationMeta['StachContentOrganizationEnum'] = {

    /**
     * value: "None"
     * @const
     */
    "None": "None",

    /**
     * value: "Row"
     * @const
     */
    "Row": "Row",

    /**
     * value: "Column"
     * @const
     */
    "Column": "Column",

    /**
     * value: "SimplifiedRow"
     * @const
     */
    "SimplifiedRow": "SimplifiedRow"
};


/**
 * Allowed values for the <code>contenttype</code> property.
 * @enum {String}
 * @readonly
 */
CalculationMeta['ContenttypeEnum'] = {

    /**
     * value: "Json"
     * @const
     */
    "Json": "Json",

    /**
     * value: "Binary"
     * @const
     */
    "Binary": "Binary"
};


/**
 * Allowed values for the <code>format</code> property.
 * @enum {String}
 * @readonly
 */
CalculationMeta['FormatEnum'] = {

    /**
     * value: "JsonStach"
     * @const
     */
    "JsonStach": "JsonStach",

    /**
     * value: "Table"
     * @const
     */
    "Table": "Table",

    /**
     * value: "Tableau"
     * @const
     */
    "Tableau": "Tableau",

    /**
     * value: "BinaryStach"
     * @const
     */
    "BinaryStach": "BinaryStach",

    /**
     * value: "Bison"
     * @const
     */
    "Bison": "Bison",

    /**
     * value: "Binary"
     * @const
     */
    "Binary": "Binary",

    /**
     * value: "Pdf"
     * @const
     */
    "Pdf": "Pdf",

    /**
     * value: "Pptx"
     * @const
     */
    "Pptx": "Pptx",

    /**
     * value: "Feather"
     * @const
     */
    "Feather": "Feather"
};



export default CalculationMeta;


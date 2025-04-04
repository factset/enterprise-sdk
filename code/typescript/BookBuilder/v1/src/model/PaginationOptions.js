/**
 * BookBuilder
 * The BookBuilder API is a powerful tool that combines detailed reports for companies of interest. Save time by using a single source of knowledge instead of relying on multiple APIs to create a presentation ready PDF, also known as a Public Information Book(PIB). </br></br> Consistently create books with the same content/reports for different companies by defining templates with the set of reports saved for re-use. Or, use templates that are created by FactSet for quick use. </br></br> With our powerful API endpoints, you can get the information on companies of interest quickly where and when you need it. </br></br> 
 *
 * The version of the OpenAPI document: 1.13.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PaginationOptions model module.
 * @module model/PaginationOptions
 */
class PaginationOptions {
    /**
     * Constructs a new <code>PaginationOptions</code>.
     * Options for pagination.
     * @alias module:model/PaginationOptions
     */
    constructor() { 
        
        PaginationOptions.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PaginationOptions</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PaginationOptions} obj Optional instance to populate.
     * @return {module:model/PaginationOptions} The populated <code>PaginationOptions</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PaginationOptions();

            if (data.hasOwnProperty('cover')) {
                obj['cover'] = ApiClient.convertToType(data['cover'], 'Boolean');
            }
            if (data.hasOwnProperty('divider')) {
                obj['divider'] = ApiClient.convertToType(data['divider'], 'Boolean');
            }
            if (data.hasOwnProperty('toc')) {
                obj['toc'] = ApiClient.convertToType(data['toc'], 'Boolean');
            }
            if (data.hasOwnProperty('footer')) {
                obj['footer'] = ApiClient.convertToType(data['footer'], 'Boolean');
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * Include a cover page.
 * @member {Boolean} cover
 */
PaginationOptions.prototype['cover'] = undefined;

/**
 * Use dividers between sections.
 * @member {Boolean} divider
 */
PaginationOptions.prototype['divider'] = undefined;

/**
 * Include a table of contents.
 * @member {Boolean} toc
 */
PaginationOptions.prototype['toc'] = undefined;

/**
 * Include footers on pages.
 * @member {Boolean} footer
 */
PaginationOptions.prototype['footer'] = undefined;

/**
 * Add a timestamp to pages.
 * @member {Boolean} timestamp
 */
PaginationOptions.prototype['timestamp'] = undefined;






export default PaginationOptions;


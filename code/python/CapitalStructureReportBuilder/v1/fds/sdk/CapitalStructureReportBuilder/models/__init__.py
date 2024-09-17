# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.CapitalStructureReportBuilder.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.CapitalStructureReportBuilder.model.error_object import ErrorObject
from fds.sdk.CapitalStructureReportBuilder.model.error_object_links import ErrorObjectLinks
from fds.sdk.CapitalStructureReportBuilder.model.error_object_source import ErrorObjectSource
from fds.sdk.CapitalStructureReportBuilder.model.error_response import ErrorResponse
from fds.sdk.CapitalStructureReportBuilder.model.meta import Meta
from fds.sdk.CapitalStructureReportBuilder.model.response import Response

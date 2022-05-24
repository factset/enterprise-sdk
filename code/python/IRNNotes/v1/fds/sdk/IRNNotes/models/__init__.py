# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.IRNNotes.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.IRNNotes.model.attachment_summary_dto import AttachmentSummaryDto
from fds.sdk.IRNNotes.model.comment_dto import CommentDto
from fds.sdk.IRNNotes.model.comment_summary_dto import CommentSummaryDto
from fds.sdk.IRNNotes.model.create_body_dto import CreateBodyDto
from fds.sdk.IRNNotes.model.create_comment_dto import CreateCommentDto
from fds.sdk.IRNNotes.model.create_custom_field_value_dto import CreateCustomFieldValueDto
from fds.sdk.IRNNotes.model.create_note_dto import CreateNoteDto
from fds.sdk.IRNNotes.model.custom_field_value_dto import CustomFieldValueDto
from fds.sdk.IRNNotes.model.event_snippet_dto import EventSnippetDto
from fds.sdk.IRNNotes.model.new_item_dto import NewItemDto
from fds.sdk.IRNNotes.model.note_dto import NoteDto
from fds.sdk.IRNNotes.model.note_event_dto import NoteEventDto
from fds.sdk.IRNNotes.model.note_summary_dto import NoteSummaryDto
from fds.sdk.IRNNotes.model.operation import Operation
from fds.sdk.IRNNotes.model.operation_type import OperationType
from fds.sdk.IRNNotes.model.problem_details import ProblemDetails
from fds.sdk.IRNNotes.model.record_change_dto import RecordChangeDto
from fds.sdk.IRNNotes.model.record_event_summary_dto import RecordEventSummaryDto
from fds.sdk.IRNNotes.model.related_records_dto import RelatedRecordsDto
from fds.sdk.IRNNotes.model.subcomment_summary_dto import SubcommentSummaryDto
from fds.sdk.IRNNotes.model.update_note_dto import UpdateNoteDto
from fds.sdk.IRNNotes.model.user_serial_dto import UserSerialDto

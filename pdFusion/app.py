# hi this is my app pdFusion which will combine pdf docs

import PyPDF2

pdf_file = open("sample.pdf", "rb")

pdf_readerObj = PyPDF2.PdfFileReader(pdf_file, strict=False)

singlePage = pdf_readerObj.getPage(1)

print(singlePage.extractText())
# Diagrama
# Diagrama en draw.io
[DiagramaCursos.drawio](https://github.com/user-attachments/files/26620953/DiagramaCursos.drawio)

<mxfile host="Electron" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) draw.io/29.6.1 Chrome/142.0.7444.265 Electron/39.8.0 Safari/537.36" version="29.6.1">
  <diagram name="Página-1" id="qgkAb6LaEqeJb61b8tR_">
    <mxGraphModel dx="2145" dy="3239" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="GXmkgNguLZ7yVyitXfuq-1" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;&lt;i&gt;ContenidoCurso&amp;lt;&amp;lt;abstract&amp;gt;&amp;gt; padre&lt;/i&gt;&lt;/font&gt;" vertex="1">
          <mxGeometry height="230" width="360" x="300" y="170" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-2" parent="GXmkgNguLZ7yVyitXfuq-1" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;#ID:int&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;#TITULO:STRING&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;#DURACION:INT&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;#COMPLETADO:boolean&lt;/p&gt;" vertex="1">
          <mxGeometry height="124" width="360" y="26" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-3" parent="GXmkgNguLZ7yVyitXfuq-1" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="360" y="150" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-4" parent="GXmkgNguLZ7yVyitXfuq-1" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+getID(): int&lt;div&gt;+getTitulo(): string&lt;/div&gt;&lt;div&gt;+setCompletado(estado:boolean): void&lt;/div&gt;&lt;div&gt;+mostrarContenido(): String &amp;lt;&amp;lt;abstract&amp;gt;&amp;gt;&lt;/div&gt;" vertex="1">
          <mxGeometry height="72" width="360" y="158" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-7" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;Leccion&lt;/font&gt;" vertex="1">
          <mxGeometry height="180" width="220" x="-100" y="500" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-8" parent="GXmkgNguLZ7yVyitXfuq-7" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-tipo: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-urlVideo: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-ContenidoTexto: String&lt;/p&gt;" vertex="1">
          <mxGeometry height="94" width="220" y="26" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-9" parent="GXmkgNguLZ7yVyitXfuq-7" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="220" y="120" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-10" parent="GXmkgNguLZ7yVyitXfuq-7" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+reproducirVideo(): void&lt;div&gt;+mostrarContenido(): String&lt;/div&gt;" vertex="1">
          <mxGeometry height="52" width="220" y="128" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-12" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;Examen&lt;/font&gt;" vertex="1">
          <mxGeometry height="180" width="220" x="827" y="510" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-13" parent="GXmkgNguLZ7yVyitXfuq-12" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-numPreguntas: Int&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-PuntajeMinimo: double&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-IntentosPermitidos: int&lt;/p&gt;" vertex="1">
          <mxGeometry height="94" width="220" y="26" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-14" parent="GXmkgNguLZ7yVyitXfuq-12" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="220" y="120" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-15" parent="GXmkgNguLZ7yVyitXfuq-12" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+realizarExamen(): Void&lt;div&gt;+mostrarContenido(): string&lt;/div&gt;" vertex="1">
          <mxGeometry height="52" width="220" y="128" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-16" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;Recursos&lt;/font&gt;" vertex="1">
          <mxGeometry height="180" width="200" x="240" y="680" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-17" parent="GXmkgNguLZ7yVyitXfuq-16" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-nombreArchivo: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-formato: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-tamañoMB:double&lt;/p&gt;" vertex="1">
          <mxGeometry height="94" width="200" y="26" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-18" parent="GXmkgNguLZ7yVyitXfuq-16" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="200" y="120" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-19" parent="GXmkgNguLZ7yVyitXfuq-16" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+descargarRecursos(): void&lt;div&gt;+mostrarContenido():String&lt;/div&gt;" vertex="1">
          <mxGeometry height="52" width="200" y="128" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-20" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;Actividad&lt;/font&gt;" vertex="1">
          <mxGeometry height="180" width="200" x="520" y="680" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-21" parent="GXmkgNguLZ7yVyitXfuq-20" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-descripcion: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-esObligatorio: boolean&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-fechaEntrega: String&lt;/p&gt;" vertex="1">
          <mxGeometry height="94" width="200" y="26" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-22" parent="GXmkgNguLZ7yVyitXfuq-20" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="200" y="120" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-23" parent="GXmkgNguLZ7yVyitXfuq-20" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+enviarTarea(): void&lt;div&gt;+mostrarContenido(): String&lt;/div&gt;" vertex="1">
          <mxGeometry height="52" width="200" y="128" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-26" edge="1" parent="1" source="GXmkgNguLZ7yVyitXfuq-4" style="endArrow=block;endSize=16;endFill=0;html=1;rounded=0;" target="GXmkgNguLZ7yVyitXfuq-7" value="">
          <mxGeometry relative="1" width="160" as="geometry">
            <mxPoint x="530.0002322206096" y="410" as="sourcePoint" />
            <mxPoint x="262.42" y="498.02" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-31" edge="1" parent="1" source="GXmkgNguLZ7yVyitXfuq-4" style="endArrow=block;endSize=16;endFill=0;html=1;rounded=0;entryX=0.5;entryY=0;entryDx=0;entryDy=0;" target="GXmkgNguLZ7yVyitXfuq-16" value="">
          <mxGeometry relative="1" width="160" as="geometry">
            <mxPoint x="709" y="480" as="sourcePoint" />
            <mxPoint x="430" y="570" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-32" edge="1" parent="1" source="GXmkgNguLZ7yVyitXfuq-4" style="endArrow=block;endSize=16;endFill=0;html=1;rounded=0;" target="GXmkgNguLZ7yVyitXfuq-20" value="">
          <mxGeometry relative="1" width="160" as="geometry">
            <mxPoint x="879" y="540" as="sourcePoint" />
            <mxPoint x="600" y="630" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-33" edge="1" parent="1" source="GXmkgNguLZ7yVyitXfuq-4" style="endArrow=block;endSize=16;endFill=0;html=1;rounded=0;" target="GXmkgNguLZ7yVyitXfuq-12" value="">
          <mxGeometry relative="1" width="160" as="geometry">
            <mxPoint x="949" y="520" as="sourcePoint" />
            <mxPoint x="670" y="610" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-34" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;Curso&lt;/font&gt;" vertex="1">
          <mxGeometry height="230" width="220" x="1200" y="-370" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-35" parent="GXmkgNguLZ7yVyitXfuq-34" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-id: int&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-nombre: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-descripcion: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-precio: double&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-modulos: List&amp;lt;Modulo&amp;gt;&lt;/p&gt;" vertex="1">
          <mxGeometry height="144" width="220" y="26" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-36" parent="GXmkgNguLZ7yVyitXfuq-34" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="220" y="170" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-37" parent="GXmkgNguLZ7yVyitXfuq-34" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+agregarModulo(m: Modulo: void&lt;div&gt;+calcularDuracionTotal(): Int&lt;/div&gt;&lt;div&gt;+publicarCurso(): void&lt;/div&gt;" vertex="1">
          <mxGeometry height="52" width="220" y="178" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-39" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;modulo&lt;/font&gt;" vertex="1">
          <mxGeometry height="250" width="230" x="365" y="-370" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-40" parent="GXmkgNguLZ7yVyitXfuq-39" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-id: int&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-nombreModulo: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-orden: int&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-contenidos: List&amp;lt;contenidoCursos&amp;gt;&lt;br&gt;&lt;/p&gt;" vertex="1">
          <mxGeometry height="144" width="230" y="26" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-41" parent="GXmkgNguLZ7yVyitXfuq-39" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="230" y="170" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-42" parent="GXmkgNguLZ7yVyitXfuq-39" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+agregarContenido(c: ContenidoCurso): void&lt;div&gt;+eliminarContenido(id: int): void&lt;/div&gt;&lt;div&gt;+getNombreModulo(): String&lt;/div&gt;" vertex="1">
          <mxGeometry height="72" width="230" y="178" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-43" edge="1" parent="1" source="GXmkgNguLZ7yVyitXfuq-35" style="endArrow=diamondThin;endFill=1;endSize=24;html=1;rounded=0;entryX=1;entryY=0.5;entryDx=0;entryDy=0;" target="GXmkgNguLZ7yVyitXfuq-40" value="">
          <mxGeometry relative="1" width="160" as="geometry">
            <mxPoint x="440" y="-20" as="sourcePoint" />
            <mxPoint x="600" y="-20" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-49" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1...*" vertex="1">
          <mxGeometry height="30" width="60" x="1160" y="-250" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-51" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1...*" vertex="1">
          <mxGeometry height="30" width="60" x="590" y="-260" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-52" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="&lt;font style=&quot;font-size: 18px;&quot;&gt;1...*&lt;/font&gt;" vertex="1">
          <mxGeometry height="60" width="100" x="460" y="-120" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-53" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="&lt;font style=&quot;font-size: 14px;&quot;&gt;1...*&lt;/font&gt;" vertex="1">
          <mxGeometry height="50" width="80" x="470" y="110" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-54" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;Categoria&lt;/font&gt;" vertex="1">
          <mxGeometry height="230" width="220" x="1320" y="-1020" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-55" parent="GXmkgNguLZ7yVyitXfuq-54" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-id: Int&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-Nombre: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-cursosAsociados: List&amp;lt;Curso&amp;gt;&lt;/p&gt;" vertex="1">
          <mxGeometry height="144" width="220" y="26" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-56" parent="GXmkgNguLZ7yVyitXfuq-54" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="220" y="170" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-57" parent="GXmkgNguLZ7yVyitXfuq-54" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+filtrarCursos():List&amp;lt;Curso&amp;gt;&lt;div&gt;+getNombreCategoria(): String&lt;/div&gt;" vertex="1">
          <mxGeometry height="52" width="220" y="178" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-58" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;inscripcion&lt;/font&gt;" vertex="1">
          <mxGeometry height="230" width="220" x="910" y="-990" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-59" parent="GXmkgNguLZ7yVyitXfuq-58" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-id: int&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-fehaInscripcion: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-Estado: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-metodoPago:String&lt;/p&gt;" vertex="1">
          <mxGeometry height="144" width="220" y="26" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-60" parent="GXmkgNguLZ7yVyitXfuq-58" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="220" y="170" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-61" parent="GXmkgNguLZ7yVyitXfuq-58" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+confirmarInscripcion(): boolean&lt;div&gt;+generarComprobantes():String&lt;/div&gt;" vertex="1">
          <mxGeometry height="52" width="220" y="178" as="geometry" />
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-62" edge="1" parent="1" source="GXmkgNguLZ7yVyitXfuq-34" style="endArrow=none;html=1;edgeStyle=orthogonalEdgeStyle;rounded=0;exitX=0.5;exitY=0;exitDx=0;exitDy=0;" target="GXmkgNguLZ7yVyitXfuq-54" value="">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="200" y="-300" as="sourcePoint" />
            <mxPoint x="680" y="-400" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="GXmkgNguLZ7yVyitXfuq-65" edge="1" parent="1" source="GXmkgNguLZ7yVyitXfuq-34" style="endArrow=none;html=1;edgeStyle=orthogonalEdgeStyle;rounded=0;" target="GXmkgNguLZ7yVyitXfuq-58" value="">
          <mxGeometry relative="1" as="geometry">
            <Array as="points">
              <mxPoint x="1020" y="-320" />
            </Array>
            <mxPoint x="780" y="-275" as="sourcePoint" />
            <mxPoint x="960" y="-390" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-1" edge="1" parent="1" source="GXmkgNguLZ7yVyitXfuq-39" style="endArrow=diamondThin;endFill=1;endSize=24;html=1;rounded=0;entryX=0.5;entryY=0;entryDx=0;entryDy=0;" target="GXmkgNguLZ7yVyitXfuq-1" value="">
          <mxGeometry relative="1" width="160" as="geometry">
            <mxPoint x="400" y="230" as="sourcePoint" />
            <mxPoint x="560" y="230" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-3" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;&lt;i&gt;Usuario&amp;lt;&amp;lt;abstract&amp;gt;&amp;gt; Padre&lt;/i&gt;&lt;/font&gt;" vertex="1">
          <mxGeometry height="230" width="360" x="1460" y="-1720" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-4" parent="xCgw6v0Ta3cf6HlTpnHw-3" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;#id: int&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;#nombre:String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;#email: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;#contraseña: String (encriptado&lt;/p&gt;" vertex="1">
          <mxGeometry height="124" width="360" y="26" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-5" parent="xCgw6v0Ta3cf6HlTpnHw-3" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="360" y="150" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-6" parent="xCgw6v0Ta3cf6HlTpnHw-3" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+login(U: String, p: String): boolean&lt;div&gt;+logout(): void&lt;/div&gt;&lt;div&gt;+cambiarContraseña(nueva: String): void&lt;/div&gt;&lt;div&gt;+getPerfil(): string &amp;lt;&amp;lt;abstract&amp;gt;&amp;gt;&lt;/div&gt;" vertex="1">
          <mxGeometry height="72" width="360" y="158" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-8" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;Estudiante&lt;/font&gt;" vertex="1">
          <mxGeometry height="250" width="230" x="2068" y="-1120" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-9" parent="xCgw6v0Ta3cf6HlTpnHw-8" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-fechaRegistro: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-cursosInscritos: List&amp;lt;Curso&amp;gt;&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-nivelAcademico: String&lt;/p&gt;" vertex="1">
          <mxGeometry height="144" width="230" y="26" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-10" parent="xCgw6v0Ta3cf6HlTpnHw-8" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="230" y="170" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-11" parent="xCgw6v0Ta3cf6HlTpnHw-8" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+inscribirse(c:Curso): void&lt;div&gt;+verProgreso(idCurso: int): double&lt;/div&gt;&lt;div&gt;+getPerfil(): String&lt;/div&gt;" vertex="1">
          <mxGeometry height="72" width="230" y="178" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-12" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;Instructor&lt;/font&gt;" vertex="1">
          <mxGeometry height="250" width="230" x="2240" y="-1900" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-13" parent="xCgw6v0Ta3cf6HlTpnHw-12" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-especialidad: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-biografia: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-cursosCreados: List&amp;lt;Curos&amp;gt;&lt;/p&gt;" vertex="1">
          <mxGeometry height="144" width="230" y="26" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-14" parent="xCgw6v0Ta3cf6HlTpnHw-12" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="230" y="170" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-15" parent="xCgw6v0Ta3cf6HlTpnHw-12" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+crearCurso(datos:&amp;nbsp; string): void&lt;div&gt;+calificarExamen(e: Examen): void&lt;/div&gt;&lt;div&gt;+getPerfil(): String&lt;/div&gt;" vertex="1">
          <mxGeometry height="72" width="230" y="178" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-16" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;Administrador&lt;/font&gt;" vertex="1">
          <mxGeometry height="190" width="230" x="2460" y="-1620" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-17" parent="xCgw6v0Ta3cf6HlTpnHw-16" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-nivelAcceso:int&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-departamento: String&lt;/p&gt;" vertex="1">
          <mxGeometry height="84" width="230" y="26" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-18" parent="xCgw6v0Ta3cf6HlTpnHw-16" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="230" y="110" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-19" parent="xCgw6v0Ta3cf6HlTpnHw-16" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+gestionarUsuarios(): void&lt;div&gt;+aprobarCursos(id: int): void&lt;/div&gt;&lt;div&gt;+generarReportes(): void&lt;/div&gt;&lt;div&gt;+getPerfil(): String&lt;/div&gt;" vertex="1">
          <mxGeometry height="72" width="230" y="118" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-20" edge="1" parent="1" source="xCgw6v0Ta3cf6HlTpnHw-12" style="endArrow=block;endSize=16;endFill=0;html=1;rounded=0;" target="xCgw6v0Ta3cf6HlTpnHw-4" value="">
          <mxGeometry relative="1" width="160" as="geometry">
            <mxPoint x="25" y="-540" as="sourcePoint" />
            <mxPoint x="-260" y="-403" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-21" edge="1" parent="1" source="xCgw6v0Ta3cf6HlTpnHw-8" style="endArrow=block;endSize=16;endFill=0;html=1;rounded=0;" target="xCgw6v0Ta3cf6HlTpnHw-3" value="">
          <mxGeometry relative="1" width="160" as="geometry">
            <mxPoint x="-320" y="-420" as="sourcePoint" />
            <mxPoint x="20" y="-259" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-22" edge="1" parent="1" source="xCgw6v0Ta3cf6HlTpnHw-16" style="endArrow=block;endSize=16;endFill=0;html=1;rounded=0;" target="xCgw6v0Ta3cf6HlTpnHw-3" value="">
          <mxGeometry relative="1" width="160" as="geometry">
            <mxPoint x="-80" y="-180" as="sourcePoint" />
            <mxPoint x="260" y="-19" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-24" edge="1" parent="1" source="xCgw6v0Ta3cf6HlTpnHw-4" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;shape=wire;dashed=1;endArrow=none;endFill=0;entryX=0.5;entryY=0;entryDx=0;entryDy=0;" target="GXmkgNguLZ7yVyitXfuq-58">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-25" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;Certificado&lt;/font&gt;" vertex="1">
          <mxGeometry height="230" width="220" x="1750" y="-650" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-26" parent="xCgw6v0Ta3cf6HlTpnHw-25" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-id: int&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-codigoVerificacion:String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-fechaEmision: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-estudiante: Estudiante&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-curso;Curso&lt;/p&gt;" vertex="1">
          <mxGeometry height="144" width="220" y="26" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-27" parent="xCgw6v0Ta3cf6HlTpnHw-25" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="220" y="170" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-28" parent="xCgw6v0Ta3cf6HlTpnHw-25" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+generarPDF(): void&lt;div&gt;+validarAutenticidad():boolean&lt;/div&gt;&lt;div&gt;+enviarPorEmail(): void&lt;/div&gt;" vertex="1">
          <mxGeometry height="52" width="220" y="178" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-29" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="1430" y="-790" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-30" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="1260" y="-410" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-31" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1...*" vertex="1">
          <mxGeometry height="30" width="60" x="1010" y="-760" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-32" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1...*" vertex="1">
          <mxGeometry height="30" width="60" x="1140" y="-350" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-35" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;Progreso&lt;/font&gt;" vertex="1">
          <mxGeometry height="230" width="220" x="2390" y="-470" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-36" parent="xCgw6v0Ta3cf6HlTpnHw-35" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-id: int&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-porcentajeCompletado: double&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-ultimaFechaAcceso: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-estudiante: Estudiante&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-curso;Curso&lt;/p&gt;" vertex="1">
          <mxGeometry height="144" width="220" y="26" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-37" parent="xCgw6v0Ta3cf6HlTpnHw-35" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="220" y="170" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-38" parent="xCgw6v0Ta3cf6HlTpnHw-35" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+actualizarporcentaje(): void&lt;div&gt;+verifcarEstadoFinal(): boolean&lt;/div&gt;&lt;div&gt;+resetearProgreso(): void&lt;/div&gt;" vertex="1">
          <mxGeometry height="52" width="220" y="178" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-39" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;Notificacion&lt;/font&gt;" vertex="1">
          <mxGeometry height="230" width="220" x="1530" y="-1280" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-40" parent="xCgw6v0Ta3cf6HlTpnHw-39" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-id: int&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-mensaje: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-leida: boolean&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-fecha: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-usuarioDestino:Usuario&lt;/p&gt;" vertex="1">
          <mxGeometry height="144" width="220" y="26" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-41" parent="xCgw6v0Ta3cf6HlTpnHw-39" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="220" y="170" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-42" parent="xCgw6v0Ta3cf6HlTpnHw-39" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+marcarComoLeido(): void&lt;div&gt;+enviarNotificacion(): void&lt;/div&gt;" vertex="1">
          <mxGeometry height="52" width="220" y="178" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-43" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;Queja&lt;/font&gt;" vertex="1">
          <mxGeometry height="230" width="220" x="2460" y="-1330" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-44" parent="xCgw6v0Ta3cf6HlTpnHw-43" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-id: int&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-descripcion: String&lt;br&gt;&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-estado: String (abierta/cerrada)&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-prioridad: String&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-autor: Estudiante&lt;/p&gt;" vertex="1">
          <mxGeometry height="144" width="220" y="26" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-45" parent="xCgw6v0Ta3cf6HlTpnHw-43" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="220" y="170" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-46" parent="xCgw6v0Ta3cf6HlTpnHw-43" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+marcarComoLeido(): void&lt;div&gt;+enviarNotificacion(): void&lt;/div&gt;" vertex="1">
          <mxGeometry height="52" width="220" y="178" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-47" parent="1" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;strokeColor=default;" value="&lt;font face=&quot;Google Sans Text, sans-serif&quot;&gt;Comentario&lt;/font&gt;" vertex="1">
          <mxGeometry height="230" width="220" x="2140" y="-120" as="geometry">
            <mxRectangle height="30" width="80" x="80" y="570" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-48" parent="xCgw6v0Ta3cf6HlTpnHw-47" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-id: int&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-contenido: String&lt;br&gt;&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-Califiacion: double&lt;/p&gt;&lt;p data-path-to-node=&quot;3,1,0,2&quot;&gt;-Fecha: String&lt;/p&gt;" vertex="1">
          <mxGeometry height="144" width="220" y="26" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-49" parent="xCgw6v0Ta3cf6HlTpnHw-47" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" value="" vertex="1">
          <mxGeometry height="8" width="220" y="170" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-50" parent="xCgw6v0Ta3cf6HlTpnHw-47" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" value="+editarComentario(nuevo: String): void&lt;div&gt;+eliminarComentario(): void&lt;/div&gt;&lt;div&gt;+getPromedioCalificacion(): double&lt;/div&gt;" vertex="1">
          <mxGeometry height="52" width="220" y="178" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-53" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1...*" vertex="1">
          <mxGeometry height="30" width="60" x="1020" y="-1020" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-54" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1...*" vertex="1">
          <mxGeometry height="30" width="60" x="1400" y="-1630" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-55" edge="1" parent="1" source="GXmkgNguLZ7yVyitXfuq-35" style="endArrow=diamondThin;endFill=1;endSize=24;html=1;rounded=0;exitX=0.997;exitY=0.617;exitDx=0;exitDy=0;exitPerimeter=0;" target="xCgw6v0Ta3cf6HlTpnHw-26" value="">
          <mxGeometry relative="1" width="160" as="geometry">
            <mxPoint x="1510" y="-200" as="sourcePoint" />
            <mxPoint x="2130" y="-570" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-59" edge="1" parent="1" source="xCgw6v0Ta3cf6HlTpnHw-35" style="endArrow=none;html=1;edgeStyle=orthogonalEdgeStyle;rounded=0;" target="xCgw6v0Ta3cf6HlTpnHw-9" value="">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="2470" y="-202" as="sourcePoint" />
            <mxPoint x="2480" y="-720" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-61" edge="1" parent="1" source="xCgw6v0Ta3cf6HlTpnHw-19" style="endArrow=diamondThin;endFill=0;endSize=24;html=1;rounded=0;" target="xCgw6v0Ta3cf6HlTpnHw-43" value="">
          <mxGeometry relative="1" width="160" as="geometry">
            <mxPoint x="2280" y="-1240" as="sourcePoint" />
            <mxPoint x="2440" y="-1240" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-64" edge="1" parent="1" source="xCgw6v0Ta3cf6HlTpnHw-48" style="endArrow=none;html=1;edgeStyle=orthogonalEdgeStyle;rounded=0;entryX=0.466;entryY=1.01;entryDx=0;entryDy=0;entryPerimeter=0;" target="GXmkgNguLZ7yVyitXfuq-37" value="">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="1580" y="478" as="sourcePoint" />
            <mxPoint x="1590" y="-40" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-65" edge="1" parent="1" source="xCgw6v0Ta3cf6HlTpnHw-25" style="endArrow=none;html=1;edgeStyle=orthogonalEdgeStyle;rounded=0;" target="xCgw6v0Ta3cf6HlTpnHw-8" value="">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="2300" y="-208" as="sourcePoint" />
            <mxPoint x="2110" y="-760" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-66" edge="1" parent="1" source="xCgw6v0Ta3cf6HlTpnHw-47" style="endArrow=none;html=1;edgeStyle=orthogonalEdgeStyle;rounded=0;exitX=0.5;exitY=0;exitDx=0;exitDy=0;" target="xCgw6v0Ta3cf6HlTpnHw-11" value="">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="3077" y="-443" as="sourcePoint" />
            <mxPoint x="2240" y="-560" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-68" edge="1" parent="1" source="GXmkgNguLZ7yVyitXfuq-35" style="endArrow=diamondThin;endFill=1;endSize=24;html=1;rounded=0;exitX=1.005;exitY=0.72;exitDx=0;exitDy=0;exitPerimeter=0;" target="xCgw6v0Ta3cf6HlTpnHw-36" value="">
          <mxGeometry relative="1" width="160" as="geometry">
            <mxPoint x="1980" y="-330" as="sourcePoint" />
            <mxPoint x="2140" y="-330" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-69" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="1420" y="-310" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-70" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1...*" vertex="1">
          <mxGeometry height="30" width="60" x="1700" y="-510" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-71" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="1420" y="-240" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-72" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1" vertex="1">
          <mxGeometry height="30" width="60" x="2330" y="-350" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-73" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="2250" y="-150" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-74" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="2300" y="-930" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-75" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="2310" y="-1050" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-76" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="2120" y="-870" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-77" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1" vertex="1">
          <mxGeometry height="30" width="60" x="2460" y="-500" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-78" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1...*" vertex="1">
          <mxGeometry height="30" width="60" x="1970" y="-570" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-79" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="2580" y="-1360" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-80" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1" vertex="1">
          <mxGeometry height="30" width="60" x="2570" y="-1430" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-81" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="1300" y="-140" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-82" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="2080" y="-20" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-85" edge="1" parent="1" source="xCgw6v0Ta3cf6HlTpnHw-39" style="endArrow=none;html=1;rounded=0;exitX=0.5;exitY=0;exitDx=0;exitDy=0;" target="xCgw6v0Ta3cf6HlTpnHw-6" value="">
          <mxGeometry height="50" relative="1" width="50" as="geometry">
            <mxPoint x="1530" y="-1120" as="sourcePoint" />
            <mxPoint x="1580" y="-1170" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-89" edge="1" parent="1" source="GXmkgNguLZ7yVyitXfuq-34" style="endArrow=none;html=1;edgeStyle=orthogonalEdgeStyle;rounded=0;entryX=0.449;entryY=1.034;entryDx=0;entryDy=0;entryPerimeter=0;exitX=0.75;exitY=0;exitDx=0;exitDy=0;" target="xCgw6v0Ta3cf6HlTpnHw-42" value="">
          <mxGeometry relative="1" as="geometry">
            <Array as="points">
              <mxPoint x="1365" y="-480" />
              <mxPoint x="1630" y="-480" />
              <mxPoint x="1630" y="-1048" />
            </Array>
            <mxPoint x="1550" y="-510" as="sourcePoint" />
            <mxPoint x="1550" y="-930" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-92" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="1360" y="-400" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-93" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="1630" y="-1050" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-94" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="1640" y="-1310" as="geometry" />
        </mxCell>
        <mxCell id="xCgw6v0Ta3cf6HlTpnHw-95" parent="1" style="text;html=1;whiteSpace=wrap;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;rounded=0;" value="1..*" vertex="1">
          <mxGeometry height="30" width="60" x="1640" y="-1490" as="geometry" />
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>

# Diagrama en imagen
<img width="2791" height="2764" alt="DiagramaCursos" src="https://github.com/user-attachments/assets/4344fa1c-6b4a-45cf-b8bb-fdc958fda9fe" />
